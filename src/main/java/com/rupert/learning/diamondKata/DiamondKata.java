package com.rupert.learning.diamondKata;

import java.util.Dictionary;
import java.util.Hashtable;

public class DiamondKata {
   
	public String[] diamondKata(String letter) {
		
		Dictionary<String, Integer> getLetterValue = new Hashtable<String, Integer>();  
		getLetterValue.put("A", 1);
		getLetterValue.put("B", 2);	
		getLetterValue.put("C", 3);
		
		int letterValue = (getLetterValue.get(letter) * 2) - 1;
		
		String[] diamond = new String[letterValue];
		
		System.out.print("length = " + diamond.length + "\n");

		if (letter.equalsIgnoreCase("A")) {		
			diamond[0] = "A";
		} else if (letter.equalsIgnoreCase("B")) {
			diamond[0] = " A";
			diamond[1] = "B B";
			diamond[2] = " A";			
		} else {
			diamond[0] = "";
			diamond[1] = "";
			diamond[2] = "";	
			diamond[3] = "";	
			diamond[4] = "";		
		}
		
		printResult(diamond);

		return diamond;
    	
    }

	private void printResult(String[] diamond) {
		
		for (int i = 0; i < diamond.length; i++) {
			System.out.print(diamond[i].toString() + "\n");
		}
		System.out.print("----------\n"); 
		
	}
}
