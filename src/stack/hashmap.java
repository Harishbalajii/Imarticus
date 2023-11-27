package stack;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hashmap = new HashMap<String,String>();
		hashmap.put("Name", "Harish");
		hashmap.put("Age ", "20");
		hashmap.put("Gender","Male");
		hashmap.put("etc" , "....");
		
		System.out.println(hashmap.get("Name"));
		System.out.println(hashmap.containsValue("20"));
		System.out.println(hashmap.keySet());
		System.out.println(hashmap.entrySet());
		System.out.println(hashmap.size());
			
		
		
		

	}

}
