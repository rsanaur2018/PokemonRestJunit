package com.poke.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class TestRunner {
   public static void main(String[] args) {
    
	   Result result = JUnitCore.runClasses(PokemonRestTestSuite.class);
      for (Failure failure : result.getFailures()) {
         System.out.println("Fail = " + failure.toString());
      }
      System.out.println("Result=="+result.wasSuccessful());
     
   
   }
} 