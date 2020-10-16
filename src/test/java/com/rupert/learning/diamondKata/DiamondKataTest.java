package com.rupert.learning.diamondKata;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class DiamondKataTest {
    	
	DiamondKata app = new DiamondKata();
	
	@Test
	public void a_Diamond_Length() {  	
		String[] test = new String[1];
		assertEquals( test.length , app.diamondKata("A").length );
	}
	
	@Test
	public void a_Diamond_Content() {  	
		String[] test = new String[1];
		test[0] = "A";
		assertArrayEquals( test , app.diamondKata("A") );
	}
	
	@Test
	public void b_Diamond_Length() {  	
		String[] test = new String[3];
		assertEquals( test.length , app.diamondKata("B").length );
	}
	
	@Test
	public void b_Diamon_Content() {  	
		String[] test = new String[3];
		test[0] = " A";
		test[1] = "B B";
		test[2] = " A";
		assertArrayEquals( test , app.diamondKata("B") );
	}
	
	@Test
	public void c_Diamon_Content() {  	
		String[] test = new String[5];
		assertEquals( test.length , app.diamondKata("C").length );
	}
	   
}
