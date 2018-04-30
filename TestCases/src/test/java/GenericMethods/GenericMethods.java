package GenericMethods;

import java.util.Random;

public class GenericMethods {
	
	public String GenerateRandom(int Lenght)
	{
		StringBuilder stringAppend = new StringBuilder();
		Random rand = new Random();
		
		char[] Letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q'};

		String RandomString;		
		
	      for(int x = 0; x <=Lenght; x = x + 1) 
	      {
	    	  int GeneratedNumber = rand.nextInt(15);
	    	  
	    	  stringAppend.append(Letters[GeneratedNumber]);	    	  
	      }
	      
	      RandomString  = stringAppend.toString();
	      return RandomString;
	}
	
	public String GenerateRandomNumber(int Lenght)
	{
		StringBuilder stringAppend = new StringBuilder();
		Random rand = new Random();
		
		String RandomString;		
		
	      for(int x = 0; x <=Lenght; x = x + 1) 
	      {
	    	  int GeneratedNumber = rand.nextInt(9);
	    	  
	    	  stringAppend.append(GeneratedNumber);	    	  
	      }
	      
	      RandomString  = stringAppend.toString();
	      return RandomString;
	}
	
	public void LoggerOutput(String Array[])
	{
		System.out.println("Elements recorded........................: ");
		for (String v : Array)
		{
			System.out.println(v);
		}
		
		System.out.println("End of data recorded..........................");
	}

}
