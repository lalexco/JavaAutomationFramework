import java.util.Arrays;

public class Exercise {
	
	public void Diagnonal(int array [])
	{
		StringBuilder blank = new StringBuilder();
		for(int item : array)
		{
			blank.append(" ");
			System.out.println(blank.toString()+item);			
		}
		
		
	}
	
	public void Anagrama(String value, String valueTwo)
	{
		char toRever[] = value.toLowerCase().toCharArray();
		char toReverTwo[] = valueTwo.toLowerCase().toCharArray();
		
		Arrays.sort(toRever);
		Arrays.sort(toReverTwo);
		
		String FinalValue = new String (toRever);
		String FinalValueTwo = new String (toReverTwo);
		
		System.out.println(FinalValue);	
		System.out.println(FinalValueTwo);	
		
	}

	public static void main(String[] args) {
		int numberArray[] =  {1,2,3,4,5,6,7,8,9};
        String AnagramaUno = "Alegan";
        String AnagramaDos = "Angela";
        
		Exercise excercise = new Exercise();
		excercise.Diagnonal(numberArray);
		excercise.Anagrama(AnagramaUno,AnagramaDos);
		

	}

}
