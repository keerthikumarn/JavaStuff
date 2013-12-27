package com.springbatch.demo.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author kenarayan
 * This class Map CSV value to Report Object and write it to xml via jaxb annotations
 */

@XmlRootElement(name = "record")
public class Report {
	private int id;
	private BigDecimal sales;
	private int quantity;
	private String staffName;
	private Date date;
	
	@XmlAttribute(name = "id")
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@XmlAttribute(name = "sales")
	public BigDecimal getSales() {
		return sales;
	}
	
	public void setSales(BigDecimal sales) {
		this.sales = sales;
	}
	
	@XmlAttribute(name = "quantity")
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@XmlAttribute(name = "staffname")
	public String getStaffName() {
		return staffName;
	}
	
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
	@XmlAttribute(name = "date")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", sales=" + sales + ", quantity="
				+ quantity + ", staffName=" + staffName + ", date=" + date
				+ "]";
	}
	
}
