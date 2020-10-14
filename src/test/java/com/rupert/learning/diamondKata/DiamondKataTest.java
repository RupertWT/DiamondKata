package com.rupert.learning.diamondKata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiamondKataTest {
    	
	DiamondKata app = new DiamondKata();
	
	@Test
	public void a_Diamond() {  	
		assertEquals( "A" , app.diamondKata("A") );
	}
	
	@Test
	public void b_Diamond() {  	
		assertEquals( " A\nB B\n A" , app.diamondKata("B") );
	}
	
	@Test
	public void c_Diamond() {  	
		assertEquals( "  A\n B B\nC   C\n B B\n  A" , app.diamondKata("C") );
	}
	   
}
