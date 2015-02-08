package com.hibernate.samples.basic;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class Tiger {

	@Id
	@Column(name = "id")
	private int id;
	
	@Embedded
	@AttributeOverrides({@AttributeOverride(name = "location", column = @Column(name = "place"))})
	private Animal animal;
	
	public Tiger(int id, Animal animal){
		this.id = id;
		this.animal = animal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
}
