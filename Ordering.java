package com.hsbc.viewLayer;

public class Ordering {
	
	public Ordering() {
		// TODO Auto-generated constructor stub
	}
	
	public double cost (String name)
	{
		if(name == "mango")
		{
			return(120);
		}
		if(name == "apple")
		{
			return(140);
		}
		if(name == "orange")
		{
			return(170);
		}
		else
		{
			return(200);
		}
	}
}
