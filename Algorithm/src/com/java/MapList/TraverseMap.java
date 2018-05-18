package com.java.MapList;

import java.util.HashMap;

public class TraverseMap {

	public static void main(String[] args) {
		HashMap<String, String> loans = new HashMap<String, String>();
		loans.put("home loan", "citibank");
		loans.put("personal loan", "Wells Fargo");

		for (String key : loans.keySet()) {
		   System.out.println("------------------------------------------------");
		   System.out.println("Iterating or looping map using java5 foreach loop");
		   System.out.println("key: " + key + " value: " + loans.get(key));
		}


	}

}
