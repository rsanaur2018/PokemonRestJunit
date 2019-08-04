package com.poke.test;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Test; 

import static org.junit.Assert.*;
//import junit.framework.TestResult;

	
public class PokemonRestTest {
	
	ArrayList<String> mylist = new ArrayList <String>();
	
	
	
	@Test
	   public void testArrayEmpty() {
		// mylist.add("helloindia");
	     assertFalse(mylist.isEmpty());	      
	   }
	
	@Test(expected = ArithmeticException.class)
	   public void testDevideByZero() {
	      //String str= "I am done with Junits setup";
	      System.out.println("I am inside test2 = ");
	      //assertEquals("I am done with Junit setup",str);
	      int x = 2;
	      int y = 10/x;
	    		  
	      
	   }
	
	@Before
	public void runBeforeTest(){
		//System.out.println("run before the test");
	}

	@After
	public void runAfterTest(){
		//System.out.println("run after test");
	}
	
	
	
	@Test		
    public void testAssert(){					
        		
        //Variable declaration		
        String string1="Junit";					
        String string2="Junit";					
        String string3="tests";					
        String string4="test";					
        String string5=null;					
        int variable1=1;					
        int	variable2=2;					
        int[] airethematicArrary1 = { 1, 2, 3 };					
        int[] airethematicArrary2 = { 1, 2, 3 };					
        		
        //Assert statements		
        assertEquals(string1,string2);					
        assertSame(string3, string4);					
        assertNotSame(string1, string3);					
        assertNotNull(string1);			
        assertNull(string5);			
        assertTrue(variable1<variable2);					
        assertArrayEquals(airethematicArrary1, airethematicArrary2);					
    }		
		
	
}