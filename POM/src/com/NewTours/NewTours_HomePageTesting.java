package com.NewTours;

import org.junit.Test;

import org.openqa.selenium.support.PageFactory;


public class NewTours_HomePageTesting extends BaseTest
{
	
	@Test
	
	//creating an object repository class object and passing arguments
	public void homepage()
	{
		WelcomeMercuryTours wmt=PageFactory.initElements(driver, WelcomeMercuryTours.class);
		wmt.signon();
		System.out.println("Webelement sigon:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt.register();
		System.out.println("Webelement register:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt.support();
		System.out.println("Webelement support:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt.contact();
		System.out.println("Webelement contact:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt.home();
		System.out.println("Webelement Home:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());System.out.println();
		driver.navigate().back();
		
		wmt.flights();
		System.out.println("Webelement Flights:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());System.out.println();
		driver.navigate().back();
		
		wmt.hotels();
		System.out.println("Webelement Hotels:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());System.out.println();
		driver.navigate().back();
		
		wmt.carRentals();
		System.out.println("webelement car rentals:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());System.out.println();
		driver.navigate().back();
		
		wmt.cruises();
		System.out.println("web element cruises:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());System.out.println();
		driver.navigate().back();
		
		wmt.destinations();
		System.out.println("web element destinations:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());System.out.println();
		driver.navigate().back();
		
		wmt.vacations();
		System.out.println("web element vacations"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());System.out.println();
		driver.navigate().back();
		
		wmt.yourDestination();
		System.out.println("web element your destination:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());System.out.println();
		driver.navigate().back();
		
		wmt.featuredVacationDestinations();
		System.out.println("web element featured vacation destination:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());System.out.println();
		driver.navigate().back();
		
		wmt.registerHere();
		System.out.println("web element register here:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());System.out.println();
		driver.navigate().back();
		
		
		wmt.about();
		System.out.println("web element about:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());System.out.println();
		driver.navigate().back();
		
		wmt.salonTravel();
		System.out.println("web element salon travel:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());System.out.println();
		driver.navigate().back();
		
		
		
	}
}
