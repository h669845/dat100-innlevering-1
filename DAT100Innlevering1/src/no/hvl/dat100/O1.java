package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {
		
		
		
		String karakter = "";
		
		int antall = 10;
		
		for(int i = 0; i < antall; i++) {
			
			String poeng = showInputDialog("Poengsum:");
			int intPoeng = parseInt(poeng);
			
			
			
			if (intPoeng >= 90 && intPoeng <= 100) {
				karakter = "A";
			} else if (intPoeng >= 80 && intPoeng <= 89) {
	            karakter = "B";
	        } else if (intPoeng >= 60 && intPoeng <= 79) {
	            karakter = "C";
	        } else if (intPoeng >= 50 && intPoeng <= 59) {
	            karakter = "D";
	        } else if (intPoeng >= 40 && intPoeng <= 49) {
	            karakter = "E";
	        } else if (intPoeng >= 0 && intPoeng <= 39) {
	            karakter = "F";
	        } else {
	            karakter = "Ugyldig poengsum, prøv igjen (0-100)";
	            antall++;
	        }
			
			String utTxt = "Karakter: " + karakter;
			
			showMessageDialog(null, utTxt);
		}
		
		

	}

}