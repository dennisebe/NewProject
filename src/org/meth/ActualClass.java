package org.meth;

public class ActualClass {
	   public void displayInfo() {
	      System.out.println("I am Original Class.");
	   }
}

	class DerClass extends ActualClass {
	   @Override
	   public void displayInfo() {
	      System.out.println("I am Overridden class.");
	   }
		   public static void main(String[] args) {
		   ActualClass oc = new ActualClass();
	       oc.displayInfo();
	       DerClass dc = new DerClass();
	       dc.displayInfo();
	   }
	 }