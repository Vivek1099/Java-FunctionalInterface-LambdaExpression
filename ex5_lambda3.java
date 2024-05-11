package Generics;

import java.util.function.Function;//note the pakage name is function
//This is the traditional way of using functional interface
class jr implements Function<String,Integer>
{
	@Override
	public Integer apply(String msg)// returns integer apply is the abstract method of function interface
	{
		return msg.length();// returns the length of string passed
	}
}
public class ex5_lambda3 {
	public static void main(String args[])
	{
		jr j=new jr();
		System.out.println(j.apply("hello java"));// calling interface method i.e returns integer as defined
		
		Function<String,String> data=(msg)->msg.toUpperCase();
		System.out.println(data.apply("hello lambda"));
		Function<String,String> mydata=(msg)->
		{
			return msg.concat("Ranchi city");// this is with return statement same output
		};
		System.out.println(mydata.apply("hello lambda method "));//method must be called
	}
}
