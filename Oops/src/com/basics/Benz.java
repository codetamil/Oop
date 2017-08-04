package com.basics;

import com.exception.EngineFailureException;

public class Benz extends Car {
	
	
	public Benz() 
	{
		
		super("Cclass","White");
		
		
	}
	@Override
	public Integer calculatingSpeed(int distance,int seconds)
	{
	//method overriding	
		System.out.println(super.calculatingSpeed(distance, seconds));
		
		System.out.println("child");
		return distance/seconds;
	}
	
	public static void main(String[] args) {
		
	}


	public char[] calculatingSpeed(double d, double e) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
