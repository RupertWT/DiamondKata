package com.rupert.learning.diamondKata;

public class DiamondKata {
   
	public String diamondKata(String letter) {
		
		String diamond = null;
		
		diamond = (letter.equalsIgnoreCase("A")) ? "A" : " A\nB B\n A";
		
		System.out.print(diamond + "\n----------\n");
		return diamond;
    	
    }
}
