package javaProgrammmes;

import java.util.HashMap;
import java.util.Map;

public class MyFirstClass {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();
		
		map.put("Apple", 985);
		map.put(null, null);
		map.put(null, 256);
		map.put("Gobhi", null);
		map.put("Cherry", 26);
		map.put("flower", 78);
		System.out.println(map);
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Before key: "+entry.getKey() + " "+"After key: "+entry.getValue());
			

		}
}}
