package com.hibernate.samples.basic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY")
public class Country {
	
	@Id
	@Column(name = "country_name")
	private String countryName;
	
	@OneToOne
	@JoinColumn(name = "capital_name")
	Capital capital;
	
	@Column(name = "country_population")
	long countryPopulation;
	
	public Country(){
		
	}
	
	public Country(String countryName, long countryPopulation){
		this.countryName =  countryName;
		this.countryPopulation = countryPopulation;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Capital getCapital() {
		return capital;
	}

	public void setCapital(Capital capital) {
		this.capital = capital;
	}

	public long getCountryPopulation() {
		return countryPopulation;
	}

	public void setCountryPopulation(long countryPopulation) {
		this.countryPopulation = countryPopulation;
	}
}
