package com.rupert.learning.diamondKata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiamondKataTest {
    	
	DiamondKata app = new DiamondKata();
	
	@Test
	public void a_Diamond() {  	
		assertEquals( "A" , app.diamondKata("A") );
	}
	   
}
