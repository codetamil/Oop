package com.basics;

import java.io.File;

import com.exception.EngineFailureException;

public class Car {

	/**
	 * @param args
	 */
	private String color,model;
	
	
		
	public Car(String model,String color) 
	{
		this.color=color;
		this.model=model;
		try {
			throw new EngineFailureException("Engine Failure");
		} catch (EngineFailureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public Integer calculatingSpeed(int distance, int seconds)
	{
		System.out.println("parent");
		return distance/seconds;
		
	}
	
	public Integer calculatingSpeed(String distance,String seconds,File f)
	{
		try
		{
		System.out.println("....");
		return Integer.parseInt(distance)/Integer.parseInt(seconds);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return 0;
	}
	public Long calculatingSpeed(long distance,long seconds)
	{
		System.out.println("long");
		return distance/seconds ;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return color+" "+model ;
	}
	
	

}
