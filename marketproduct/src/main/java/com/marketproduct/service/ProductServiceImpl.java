package com.marketproduct.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketproduct.entities.Product;
import com.marketproduct.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository prorepo;
	
	@Override
	public void savedata(Product p) {
		prorepo.save(p);
	}

	@Override
	public List<Product> listAllData() {
		List<Product> prod = prorepo.findAll();
		return prod;
	}

	@Override
	public void deleteOneData(long bot) {
		prorepo.deleteById(bot);
		
	}

	@Override
	public Product getById(long bot) {
		Optional<Product> findById = prorepo.findById(bot);
		Product product = findById.get();
		return product;
	}
}
