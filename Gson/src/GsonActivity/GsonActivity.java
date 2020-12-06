package GsonActivity;

import java.lang.reflect.Type;

import org.json.JSONObject;
import com.google.gson.Gson;

public class GsonActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 取得Json字串   轉 Json物件
		 */
		JSONObject jsonObject ;
		String registerMachine = "{\n" +
                "    \"success\": false,\n" +
                "    \"errorMessage\": \"MISSING_REQUIRED_PARAMETER(102):username\",\n" +
                "    \"errorCode\": 102,\n" +
                "    \"errorUuid\": \"c29c8904-3bd3-4e92-9f2e-1c0076a83d8f\"\n" +
                "}";
		jsonObject = new JSONObject(registerMachine);
		
		
		/**
		 * Json物件轉GsonClass
		 */
		Gson gson = new Gson();
		GsonData gsonData = gson.fromJson(String.valueOf(jsonObject), GsonData.class);
		
		
		/**
		 * 取值方式
		 */
		System.out.println("getErrorMessage = " + gsonData.getErrorMessage());
		   
		
		
		
		
		
	}

}
