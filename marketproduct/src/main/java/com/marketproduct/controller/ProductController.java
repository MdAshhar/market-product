package com.marketproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketproduct.entities.Product;
import com.marketproduct.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	
	@RequestMapping("/viewproductdetails")
	public String saveProductDetails() {
		return"insertProduct";
	}
	@RequestMapping("/savedata")
	public String savedata(@ModelAttribute("product")Product p) {
		service.savedata(p);
		return"insertProduct";
	}
	
//	@RequestMapping("/savedata")
//	public String savedata(SavePro p) {
//		Product a=new Product();
//		a.setP_name(p.getP_name());
//		a.setP_price(p.getP_price());
//		a.setP_quantity(p.getP_quantity());
//		service.savedata(a);
//		
//		return"insertProduct";
//	}
	@RequestMapping("/listall")
	public String listAllData(ModelMap model) {
		List<Product> prod = service.listAllData();
		model.addAttribute("prod", prod);
		return"list_product";
	}
	@RequestMapping("/deletedata")
	public String deleteOnData(@RequestParam("id")long bot, Model model) {
		service.deleteOneData(bot);
		List<Product> prod = service.listAllData();
		model.addAttribute("prod", prod);
		return"list_product";
		
	}
	@RequestMapping("/updatedata")
	public String updatedata(@RequestParam("id")long bot, Model model) {
		Product product = service.getById(bot);
		model.addAttribute("product", product);
		return "updateproduct";
	}
	@RequestMapping("/updateOneData")
	public String updateOneData(@ModelAttribute("product")Product p, Model model) {
		service.savedata(p);
		List<Product> prod = service.listAllData();
		model.addAttribute("prod", prod);
		return"list_product";
	}
}