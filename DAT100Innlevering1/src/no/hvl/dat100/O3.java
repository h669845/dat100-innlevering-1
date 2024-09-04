package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {
	
	public static int utregning(int tall) {
		int fakultet = 1;
		for (int i = 1; i <= tall; i++){
			fakultet *= i;
		}
		return fakultet;
	}

	public static void main(String[] args) {

		int tall;

		do {
			String tallTxt = showInputDialog("Skriv inn et positivt heltall:");
			tall = parseInt(tallTxt);

			if (tall < 0) {
				showMessageDialog(null, "Tallet er negativt");
			} else {
				int fakultet = utregning(tall);
				String utTxt = tall + "! = " + fakultet;
				showMessageDialog(null, utTxt);
			}

		} while (tall < 0);
		
		

	}

}
