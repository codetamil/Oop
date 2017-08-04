package com.test;

import java.io.File;
import java.io.IOException;

import com.basics.Benz;
import com.basics.Car;

public class TestCar {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		
		Benz car = new Benz();
		File f= new File("a.txt");
		
		if(f.createNewFile())
		{
			System.out.println("New File Created");
		}
		else
		{
			System.out.println("file already exists");
		}
		System.out.println(car);
		
		
		System.out.println(car.calculatingSpeed("revathy", "ss",f));
		System.out.println(car.calculatingSpeed(113202, 672));
		
		/*{
			System.out.println("Am in catch block "+e.getMessage());
		}*/

	}

}
