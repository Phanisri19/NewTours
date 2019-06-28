package com.NewTours;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


//object repository class - which stores the information of the elements which are identified in the web page

public class WelcomeMercuryTours
{
	
	
	//Webelement signon=driver.findelement(By.linkText("SIGN-ON"));
	
	//identifying the element based on properrty using @findby annotation
	
	//<a href="mercurysignon.php?osCsid=39106e9c51f22ecbd2fa13618cce3185">SIGN-ON</a>
	@FindBy(linkText="SIGN-ON")
	 WebElement Signon;
	public void signon()
	{
		Signon.click();
	}
	
	
	
	//<a href="mercuryregister.php">REGISTER</a>
	@FindBy(linkText="REGISTER")
	WebElement Register;
	public void register()
	{
		Register.click();
	}
	
	
	//<a href="mercuryunderconst.php">SUPPORT</a>
	@FindBy(linkText="SUPPORT")
	WebElement Support;
	public void support()
	{
		Support.click();
	}
	
	
	
	//<a href="mercuryunderconst.php">CONTACT</a>
	@FindBy(linkText="CONTACT")
	WebElement Contact;
	public void contact()
	{
		Contact.click();
	}
	
	//<a href="mercurywelcome.php">Home</a>
	@FindBy(linkText="Home")
	WebElement Home;
	public void home()
	{
	   Home.click();
	}
	
	
	//<a href="mercuryreservation.php">Flights</a>
	@FindBy(linkText="Flights")
	WebElement Flights;
	public void flights()
	{
	   Flights.click();
	}
	
	

	//<a href="mercuryunderconst.php">Hotels</a>
	@FindBy(linkText="Hotels")
	WebElement Hotels;
	public void hotels()
	{
	   Hotels.click();
	}
	
	//<a href="mercuryunderconst.php">Car Rentals</a>
	@FindBy(linkText="Car Rentals")
	WebElement CarRentals;
	public void carRentals()
	{
	   CarRentals.click();
	}
	
	//<a href="mercurycruise.php">Cruises</a>
	@FindBy(linkText="Cruises")
	WebElement Cruises;
	public void cruises()
	{
	   Cruises.click();
	}
	
	//<a href="mercuryunderconst.php">Destinations</a>
	@FindBy(linkText="Destinations")
	WebElement Destinations;
	public void destinations()
	{
	   Destinations.click();
	}
	
	//<a href="mercuryunderconst.php">Vacations</a>
	@FindBy(linkText="Vacations")
	WebElement Vacations;
	public void vacations()
	{
	   Vacations.click();
	}
	
	
	
	//<a href="mercuryunderconst.php">your destination</a>
	@FindBy(linkText="your destination")
	WebElement YourDestination;
	public void yourDestination()
	{
	   YourDestination.click();
	}
	
	//<a href="mercuryunderconst.php">featured vacation destinations</a>
	@FindBy(linkText="featured vacation destinations")
	WebElement FeaturedVacationDestinations;
	public void featuredVacationDestinations()
	{
	   FeaturedVacationDestinations.click();
	}
	
	//<a href="mercuryregister.php">Register here</a>
	@FindBy(linkText="Register here")
	WebElement RegisterHere;
	public void registerHere()
	{
	   RegisterHere.click();
	}
	
	//<a href="http://businesstravel.about.com/mbody.htm?PM=78_101_T&amp;cob=home" target="_blank">Business Travel @ About.com</a>
	@FindBy(linkText="About.com")
	WebElement About;
	public void about()
	{
	   About.click();
	}
	
	//<a href="http://www.salon.com/travel/index.html" target="_blank">Salon Travel</a>
	@FindBy(linkText="Salon Travel")
	WebElement SalonTravel;
	public void salonTravel()
	{
	   SalonTravel.click();
	}
	
	
	
	
	
}
