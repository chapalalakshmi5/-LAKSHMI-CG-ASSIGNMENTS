package com.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Tourist implements InitializingBean,DisposableBean {
	private String touristname;
	private int touristnumber;
	public Tourist(String touristname, int touristnumber) {
		super();
		this.touristname = touristname;
		this.touristnumber = touristnumber;
	}
	public Tourist() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Tourist [touristname=" + touristname + ", touristnumber=" + touristnumber + "]";
	}
	public String getTouristname() {
		return touristname;
	}
	public void setTouristname(String touristname) {
		this.touristname = touristname;
	}
	public int getTouristnumber() {
		return touristnumber;
	}
	public void setTouristnumber(int touristnumber) {
		this.touristnumber = touristnumber;
	}
	public void destroy() throws Exception {
		
		System.out.println("inside destroy()method performed clean up tasks");
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("after propertiesset");
		
		
	}

}
