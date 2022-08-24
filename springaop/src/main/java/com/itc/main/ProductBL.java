package com.itc.main;

import org.springframework.stereotype.Component;

@Component
public class ProductBL {

	public ProductBL() {
		System.out.println("BL object is created..");
	}
	public void m1() {
		System.out.println("inside the m1 method");
	}
	
	public void m2() {
		System.out.println("inside the m2 method");
	}
	
}
