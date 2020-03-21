package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	private int aid;
	private String aname;
	private String tech;
	@Autowired
	private Laptop laptop;
	
	
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	//this class is just to display the object of alien class
	public Alien() {
		super();
		System.out.println("done");
	}
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	
	public void show() {
		System.out.println("Alien class object is created after that show method is called....");
		laptop.compile();
	}
	
}
