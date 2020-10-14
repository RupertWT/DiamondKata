package com.rupert.learning.diamondKata;

import java.util.Dictionary;
import java.util.Hashtable;

public class DiamondKata {
   
	public String diamondKata(String letter) {
		
		Dictionary<String, Integer> letterPlaceValue = new Hashtable<String, Integer>();  
		letterPlaceValue.put("A", 1);
		letterPlaceValue.put("B", 2);
		letterPlaceValue.put("C", 3);
		
		int letterValue = letterPlaceValue.get("A");
		String spaces = null;
		String diamond = null;

		
		diamond = (letter.equalsIgnoreCase("A")) ? "A" : " A\nB B\n A";
		
		
		
		
		
		
		
		
		System.out.print(diamond + "\n----------\n");
		//System.out.print("  A\n B B\nC   C\n B B\n  A" + "\n----------\n");
		//System.out.print(letterPlaceValue.get("A"));
		return diamond;
    	
    }
}
