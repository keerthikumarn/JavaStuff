package com.soap.webservices.product.service;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalogServiceImpl {
	
	private List<String> booksList = new ArrayList<String>();
	private List<String> musicList = new ArrayList<String>();
	private List<String> moviesList = new ArrayList<String>();
	
	public ProductCatalogServiceImpl(){
		booksList.add("Himalayan Blunder");
		booksList.add("HeadFirst Java");
		booksList.add("India after Gandhi");
		
		musicList.add("MTV Metal Heads");
		musicList.add("Boring Heck Play");
		musicList.add("Heavy Metal Album");
		
		moviesList.add("Raid on Entebbe");
		moviesList.add("Oman");
		moviesList.add("Apacolypto");
	}
	
	public List<String> getProducts(String category){
		switch(category.toLowerCase()){
		case "books":
			return booksList;
			
		case "music":
			return musicList;
			
		case "movies":
			return moviesList;
		}
		return null;
	}
	
	public List<String> getProductCategories(){
		List<String> prodList = new ArrayList<String>();
		prodList.add("Books");
		prodList.add("Movies");
		prodList.add("Music");
		return prodList;
	}
	
	public boolean addProduct(String category, String product){
		switch(category.toLowerCase()){
		case "books":
			booksList.add(product);
			break;
			
		case "music":
			musicList.add(product);
			break;
			
		case "movies":
			moviesList.add(product);
			break;
		default : return false;
		}
		return true;
	}
	
}
