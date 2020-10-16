package com.rupert.learning.diamondKata;

import java.util.Dictionary;
import java.util.Hashtable;

public class DiamondKata {
   
	public String[] diamondKata(String letter) {
		
//		Dictionary<String, Integer> getLetterValue = new Hashtable<String, Integer>();  
//		letterPlaceValue.put("A", 1);
//		letterPlaceValue.put("B", 2);
//		letterPlaceValue.put("C", 3);		
//		int letterValue = getLetterValue.get("A");

		int i = (letter.equalsIgnoreCase("A")) ? 1 : 3;
		
		String[] diamond = new String[i];
		
		if (letter.equalsIgnoreCase("A")) {		
			diamond[0] = "A";
		} else {
			diamond[0] = " A";
			diamond[1] = "B B";
			diamond[2] = " A";			
		}
		
		System.out.print(diamond[0].toString() + "\n");

		return diamond;
    	
    }
}
