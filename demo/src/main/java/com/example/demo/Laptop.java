package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private int lid;
	private String brnad;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrnad() {
		return brnad;
	}
	public void setBrnad(String brnad) {
		this.brnad = brnad;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brnad=" + brnad + "]";
	}
	
	
	//Laptop class object is created in alien class using autowired annotation from where this class method is called from alien
	//alien->(autowired)laptop->compile method
	public void compile() {
		System.out.println("Compiling....");
	}
	
	
	
}
