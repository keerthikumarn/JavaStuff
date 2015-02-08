package com.hibernate.samples.basic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAPITAL")
public class Capital {

	@Id
	@Column(name = "capital_name")
	private String capitalName;

	@Column(name = "Capital_Population")
	long capitalPopulation;

	public Capital() {

	}

	public Capital(String capitalName, long capitalPopulation) {
		super();
		this.capitalName = capitalName;
		this.capitalPopulation = capitalPopulation;
	}

	public String getCapitalName() {
		return capitalName;
	}

	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}

	public long getCapitalPopulation() {
		return capitalPopulation;
	}

	public void setCapitalPopulation(long capitalPopulation) {
		this.capitalPopulation = capitalPopulation;
	}
	
}
