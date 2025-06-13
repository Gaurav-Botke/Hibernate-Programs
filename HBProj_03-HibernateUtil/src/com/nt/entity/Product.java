//Entity class /Domain Class/ Model class/Persistent class/HOL class(Hibernate object class)
package com.nt.entity;

import java.io.Serializable;

public class Product implements Serializable {
       //bean property
	private Integer pid;
	private String pname;
	private Float price;
	private Float qty;
	
	
	//setter and getter method
    public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Float getQty() {
		return qty;
	}
	public void setQty(Float qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
	
}
