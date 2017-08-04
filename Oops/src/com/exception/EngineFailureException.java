package com.exception;

//creating an exception
public class EngineFailureException extends Exception{
	
	public EngineFailureException(String name)
	{
		System.out.println(name);
	}

}
