package MainContext;
import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FrameworkContext {
	
	public static String GetJsonString(String Parameter)
	{
		String Value = "";
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("C:\\Users\\admin\\eclipse-workspace\\TestCases\\src\\test\\java\\Config.json"));
			JSONObject jsonObject = (JSONObject) obj;
			Value = (String) jsonObject.get(Parameter);
		}
		catch(Exception e)
		{
			System.out.println("NO puedo localizar el parametro que necesitas.");
			System.out.println(e.getMessage());
		}
		return Value;
	}

}
