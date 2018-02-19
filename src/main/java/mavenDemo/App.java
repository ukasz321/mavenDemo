package mavenDemo;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class App {

	public static void main(String[] args) {
		Map <String, String> map = new HashMap <String, String>();
		
		map.put("A", "B");
		map.put("C", "D");
		map.put("E", "F");
		
		Gson gson = new Gson();
		System.out.println(gson.toJson(map));

	}

}
