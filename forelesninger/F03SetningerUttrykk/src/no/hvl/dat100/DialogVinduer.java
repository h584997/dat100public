package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class DialogVinduer {

  public static void main(String[] args) {
	  
    String tallTxt = showInputDialog("Gi et tall:");
    
    int tall = parseInt(tallTxt);
    int dobbeltall = tall*2;

    String utTxt = "Svar: " + dobbeltall;
    
    showMessageDialog(null, utTxt);
  }

}