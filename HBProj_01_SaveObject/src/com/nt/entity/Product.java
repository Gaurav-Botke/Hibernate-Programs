//Entity class /Domain Class/ Model class/Persistent class/HOL class(Hibernate object class)
package com.nt.entity;

import java.io.Serializable;

public class Product implements Serializable {
       //bean property
	private int pid;
	private String pname;
	private float price;
	private float qty;
	
	
	//setter and getter method
    public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getQty() {
		return qty;
	}
	public void setQty(float qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
	
}
