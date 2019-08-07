package no.hvl.dat100.testproject;

import easygraphics.EasyGraphics;

public class Graphic extends EasyGraphics {   // L14

	  public static void main(String[] args) {
	    launch(args);
	  }

	  public void run() {
	    makeWindow("Sirkel", 800, 800);              // L21
	    
	    fillCircle(400, 400, 200);                   // L23
	  }
	}
