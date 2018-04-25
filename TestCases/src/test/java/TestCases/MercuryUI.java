package TestCases;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import GenericMethods.GenericMethods;
import PageObjects.FlightFinder;
import PageObjects.HomePage;
import PageObjects.RegisterPage;
import PageObjects.SignOn;

public class MercuryUI {
	HomePage homePage;
	RegisterPage registerPage;
	SignOn signOn;
	FlightFinder flightFinder;
	
	  @Test
	  public void NewUserRegistration() {

		  
		  GenericMethods generic = new GenericMethods();
		  String RandomFirstName = generic.GenerateRandom(6);
		  String RandomLastName = generic.GenerateRandom(6);
		  String RandomUserName = generic.GenerateRandom(5) + "@testing.com";
		  String RandomPhone = generic.GenerateRandomNumber(9);
		  String RandomAddress = generic.GenerateRandom(9);
		  String RandomCity = generic.GenerateRandom(9);
		  String RandomState = generic.GenerateRandom(9);
		  String RandomPostal = generic.GenerateRandomNumber(5);
		  String RandomEmail = RandomUserName;
		  String RandomPassword = generic.GenerateRandom(9);
		  String RandomConfirmationPsw = RandomPassword;
	  
		  homePage
		  .GoTo()
		  .Scroll("window.scrollBy(0,80)")
		  .DoClick(homePage.RegisterMenu);
		  
		  registerPage
		  .ValidateCurrentTitle()
		  .Click(registerPage.FristName)
		  .enterText(registerPage.FristName,RandomFirstName )
		  .enterText(registerPage.LastName, RandomLastName)
		  .enterText(registerPage.UserName,RandomUserName )
		  .enterText(registerPage.Phone, RandomPhone)
		  .enterText(registerPage.Address, RandomAddress)
		  .enterText(registerPage.City, RandomCity)
		  .enterText(registerPage.State, RandomState)
		  .enterText(registerPage.PostalCode, RandomPostal)
		  .enterText(registerPage.Email, RandomEmail)
		  .enterText(registerPage.Password, RandomPassword)
		  .enterText(registerPage.ConfirmPassword, RandomConfirmationPsw)
		  .SubmitValue(registerPage.RegisterBtn);
		  
		  Assert.assertEquals(RegisterPage.GetUrl(), "http://newtours.demoaut.com/create_account_success.php");
		  System.out.println("URL obtained is correct: " + RegisterPage.GetUrl());
		  //Assert.assertEquals(registerPage.ElementManualSearch("Xpath", "//*[contains(.,' Dear "+RandomFirstName+" "+RandomLastName+",')]")," Dear "+RandomFirstName+" "+RandomLastName+",");

		  String [] Logger = {RandomFirstName,RandomLastName,RandomUserName,RandomPhone,RandomAddress
				  ,RandomCity,RandomState,RandomPostal,RandomEmail,RandomPassword,RandomConfirmationPsw};
		  
		  generic.LoggerOutput(Logger);
		  
	  }
	  
	  @Test
	  public void LoginAndScheduleFlight_OneWay() {

		  
		  GenericMethods generic = new GenericMethods();
		  String RandomFirstName = generic.GenerateRandom(6);
		  String RandomLastName = generic.GenerateRandom(6);
		  String RandomUserName = generic.GenerateRandom(5) + "@testing.com";
		  String RandomPhone = generic.GenerateRandomNumber(9);
		  String RandomAddress = generic.GenerateRandom(9);
		  String RandomCity = generic.GenerateRandom(9);
		  String RandomState = generic.GenerateRandom(9);
		  String RandomPostal = generic.GenerateRandomNumber(5);
		  String RandomEmail = RandomUserName;
		  String RandomPassword = generic.GenerateRandom(9);
		  String RandomConfirmationPsw = RandomPassword;
	  
		  homePage
		  .GoTo()
		  .Scroll("window.scrollBy(0,80)")
		  .DoClick(homePage.RegisterMenu);
		  
		  registerPage
		  .ValidateCurrentTitle()
		  .Click(registerPage.FristName)
		  .enterText(registerPage.FristName,RandomFirstName )
		  .enterText(registerPage.LastName, RandomLastName)
		  .enterText(registerPage.UserName,RandomUserName )
		  .enterText(registerPage.Phone, RandomPhone)
		  .enterText(registerPage.Address, RandomAddress)
		  .enterText(registerPage.City, RandomCity)
		  .enterText(registerPage.State, RandomState)
		  .enterText(registerPage.PostalCode, RandomPostal)
		  .enterText(registerPage.Email, RandomEmail)
		  .enterText(registerPage.Password, RandomPassword)
		  .enterText(registerPage.ConfirmPassword, RandomConfirmationPsw)
		  .SubmitValue(registerPage.RegisterBtn);
		  
		  Assert.assertEquals(RegisterPage.GetUrl(), "http://newtours.demoaut.com/create_account_success.php");
		  System.out.println("URL obtained is correct: " + RegisterPage.GetUrl());
		  //Assert.assertEquals(registerPage.ElementManualSearch("Xpath", "//*[contains(.,' Dear "+RandomFirstName+" "+RandomLastName+",')]")," Dear "+RandomFirstName+" "+RandomLastName+",");

		  homePage
		  .DoClick(homePage.SignOn);
		  
		  signOn
		  .ValidateCurrentTitle()
		  .enterText(signOn.UserName,RandomEmail)
		  .enterText(signOn.Password, RandomPassword)
		  .SubmitValue(signOn.Login);
		  
		  flightFinder
		  .ValidateCurrentTitle()
		  .Click(flightFinder.OneWay)
		  .Click(flightFinder.AirlineDrop)
		  .Click(flightFinder.BlueSkies)
		  .Click(flightFinder.FindflightsContinue)
		  .Click(flightFinder.ReserveFlights)
		  .enterText(flightFinder.PassFirstName, RandomFirstName)
		  .enterText(flightFinder.PassLastName, RandomLastName)
		  .enterText(flightFinder.CardNumber, RandomPhone)
		  .SubmitValue(flightFinder.PurchaseBtn)
		  .ValidateMessage(flightFinder.MessageConfirmation,"Your itinerary has been booked!");
		  
		  String [] Logger = {RandomFirstName,RandomLastName,RandomUserName,RandomPhone,RandomAddress
				  ,RandomCity,RandomState,RandomPostal,RandomEmail,RandomPassword,RandomConfirmationPsw};
		  
		  generic.LoggerOutput(Logger);
		  
	  }
	  
	  @Test
	  public void LoginAndScheduleFlight_RoundTrip() {

		  GenericMethods generic = new GenericMethods();
		  String RandomFirstName = generic.GenerateRandom(6);
		  String RandomLastName = generic.GenerateRandom(6);
		  String RandomUserName = generic.GenerateRandom(5) + "@testing.com";
		  String RandomPhone = generic.GenerateRandomNumber(9);
		  String RandomAddress = generic.GenerateRandom(9);
		  String RandomCity = generic.GenerateRandom(9);
		  String RandomState = generic.GenerateRandom(9);
		  String RandomPostal = generic.GenerateRandomNumber(5);
		  String RandomEmail = RandomUserName;
		  String RandomPassword = generic.GenerateRandom(9);
		  String RandomConfirmationPsw = RandomPassword;
		  
		  homePage
		  .GoTo()
		  .Scroll("window.scrollBy(0,80)")
		  .DoClick(homePage.RegisterMenu);
			  	  
		  registerPage
		  .ValidateCurrentTitle()
		  .Click(registerPage.FristName)
		  .enterText(registerPage.FristName,RandomFirstName )
		  .enterText(registerPage.LastName, RandomLastName)
		  .enterText(registerPage.UserName,RandomUserName )
		  .enterText(registerPage.Phone, RandomPhone)
		  .enterText(registerPage.Address, RandomAddress)
		  .enterText(registerPage.City, RandomCity)
		  .enterText(registerPage.State, RandomState)
		  .enterText(registerPage.PostalCode, RandomPostal)
		  .enterText(registerPage.Email, RandomEmail)
		  .enterText(registerPage.Password, RandomPassword)
		  .enterText(registerPage.ConfirmPassword, RandomConfirmationPsw)
		  .SubmitValue(registerPage.RegisterBtn);
			  	  
		  Assert.assertEquals(RegisterPage.GetUrl(), "http://newtours.demoaut.com/create_account_success.php");
		  System.out.println("URL obtained is correct: " + RegisterPage.GetUrl());
		  //Assert.assertEquals(registerPage.ElementManualSearch("Xpath", "//*[contains(.,' Dear "+RandomFirstName+" "+RandomLastName+",')]")," Dear "+RandomFirstName+" "+RandomLastName+",");

		  homePage
		  .DoClick(homePage.SignOn);
			  
		  signOn
		  .ValidateCurrentTitle()
		  .enterText(signOn.UserName,RandomEmail)
		  .enterText(signOn.Password, RandomPassword)
		  .SubmitValue(signOn.Login);
			  
		  flightFinder
		  .ValidateCurrentTitle()
		  .Click(flightFinder.RoundTrip)
		  .Click(flightFinder.UnifiedAirlines)
		  .Click(flightFinder.BlueSkies)
		  .Click(flightFinder.FindflightsContinue)
		  .Click(flightFinder.ReserveFlights)
		  .enterText(flightFinder.PassFirstName, RandomFirstName)
		  .enterText(flightFinder.PassLastName, RandomLastName)
		  .enterText(flightFinder.CardNumber, RandomPhone)
		  .SubmitValue(flightFinder.PurchaseBtn)
		  .ValidateMessage(flightFinder.MessageConfirmation,"Your itinerary has been booked!");
			  
		  String [] Logger = {RandomFirstName,RandomLastName,RandomUserName,RandomPhone,RandomAddress
				  ,RandomCity,RandomState,RandomPostal,RandomEmail,RandomPassword,RandomConfirmationPsw};
			  
		  generic.LoggerOutput(Logger);
	  }
	  
	  @Test
	  public void LoginAndScheduleFlight_BackToHome() {


		  GenericMethods generic = new GenericMethods();
		  String RandomFirstName = generic.GenerateRandom(6);
		  String RandomLastName = generic.GenerateRandom(6);
		  String RandomUserName = generic.GenerateRandom(5) + "@testing.com";
		  String RandomPhone = generic.GenerateRandomNumber(9);
		  String RandomAddress = generic.GenerateRandom(9);
		  String RandomCity = generic.GenerateRandom(9);
		  String RandomState = generic.GenerateRandom(9);
		  String RandomPostal = generic.GenerateRandomNumber(5);
		  String RandomEmail = RandomUserName;
		  String RandomPassword = generic.GenerateRandom(9);
		  String RandomConfirmationPsw = RandomPassword;
		  
		  homePage
		  .GoTo()
		  .Scroll("window.scrollBy(0,80)")
		  .DoClick(homePage.RegisterMenu);
			  	  
		  registerPage
		  .ValidateCurrentTitle()
		  .Click(registerPage.FristName)
		  .enterText(registerPage.FristName,RandomFirstName )
		  .enterText(registerPage.LastName, RandomLastName)
		  .enterText(registerPage.UserName,RandomUserName )
		  .enterText(registerPage.Phone, RandomPhone)
		  .enterText(registerPage.Address, RandomAddress)
		  .enterText(registerPage.City, RandomCity)
		  .enterText(registerPage.State, RandomState)
		  .enterText(registerPage.PostalCode, RandomPostal)
		  .enterText(registerPage.Email, RandomEmail)
		  .enterText(registerPage.Password, RandomPassword)
		  .enterText(registerPage.ConfirmPassword, RandomConfirmationPsw)
		  .SubmitValue(registerPage.RegisterBtn);
			  	  
		  Assert.assertEquals(RegisterPage.GetUrl(), "http://newtours.demoaut.com/create_account_success.php");
		  System.out.println("URL obtained is correct: " + RegisterPage.GetUrl());
		  //Assert.assertEquals(registerPage.ElementManualSearch("Xpath", "//*[contains(.,' Dear "+RandomFirstName+" "+RandomLastName+",')]")," Dear "+RandomFirstName+" "+RandomLastName+",");

		  homePage
		  .DoClick(homePage.SignOn);
			  
		  signOn
		  .ValidateCurrentTitle()
		  .enterText(signOn.UserName,RandomEmail)
		  .enterText(signOn.Password, RandomPassword)
		  .SubmitValue(signOn.Login);
			  
		  flightFinder
		  .ValidateCurrentTitle()
		  .Click(flightFinder.RoundTrip)
		  .Click(flightFinder.UnifiedAirlines)
		  .Click(flightFinder.BlueSkies)
		  .Click(flightFinder.FindflightsContinue)
		  .Click(flightFinder.ReserveFlights)
		  .enterText(flightFinder.PassFirstName, RandomFirstName)
		  .enterText(flightFinder.PassLastName, RandomLastName)
		  .enterText(flightFinder.CardNumber, RandomPhone)
		  .SubmitValue(flightFinder.PurchaseBtn)
		  .ValidateMessage(flightFinder.MessageConfirmation,"Your itinerary has been booked!")
		  .Scroll("window.scrollBy(0,250)")
		  .Click(flightFinder.BackToHomeBtn);
		  
		  homePage
		  .ValidateTitle();
		  
		  System.out.println("Back To Home button works as expected.......");
			  
		  String [] Logger = {RandomFirstName,RandomLastName,RandomUserName,RandomPhone,RandomAddress
				  ,RandomCity,RandomState,RandomPostal,RandomEmail,RandomPassword,RandomConfirmationPsw};
			  
		  generic.LoggerOutput(Logger);
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  homePage = new HomePage("Welcome: Mercury Tours");  
		  registerPage = new RegisterPage("Register: Mercury Tours");
		  signOn = new SignOn("Sign-on: Mercury Tours");
		  flightFinder = new FlightFinder("Find a Flight: Mercury Tours:");
	  }

	  @AfterTest
	  public void afterTest() {
		  homePage.EndDriver();
		 
	  }
}
