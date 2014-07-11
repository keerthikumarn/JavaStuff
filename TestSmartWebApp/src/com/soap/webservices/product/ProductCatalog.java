package com.soap.webservices.product;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.soap.webservices.product.service.ProductCatalogServiceImpl;

@WebService
public class ProductCatalog {
	ProductCatalogServiceImpl service = new ProductCatalogServiceImpl();

	@WebMethod
	public List<String> getProductCategories(){
		return service.getProductCategories();
	}
	
	@WebMethod
	public List<String> getProducts(String category){
		return service.getProducts(category);
	}
	
	@WebMethod
	public boolean addProduct(String category, String product){
		return service.addProduct(category, product);
	}
}
