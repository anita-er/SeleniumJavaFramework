package com.leduka;

import org.testng.annotations.Test;

public class TestNgGroupDemo 
{
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("This is first test");
		
	}
	@Test(groups= {"sanity","smoke"})
	public void test2()
	{
		System.out.println("This is 2 test");
	}
	
	@Test(groups= {"sanity","regression"})
	public void test3()
	{
		System.out.println("This is 3 test");
	}
	@Test
	public void test4()
	{
		System.out.println("This is 4 test");
	}
	
	
}
