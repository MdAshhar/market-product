package com.marketproduct.service;
import java.util.List;

import com.marketproduct.entities.Product;

public interface ProductService {
	public void savedata(Product p);

	public List<Product> listAllData();

	public void deleteOneData(long bot);

	public Product getById(long bot);

}
