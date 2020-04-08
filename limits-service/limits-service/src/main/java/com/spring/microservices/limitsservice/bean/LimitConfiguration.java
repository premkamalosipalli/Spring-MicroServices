package com.spring.microservices.limitsservice.bean;

public class LimitConfiguration {
	
	private int maximum;
	private int minimum;
	
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	
	public LimitConfiguration(int maximum, int minimum) {
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	protected LimitConfiguration() {
		
	}
	
	

}
