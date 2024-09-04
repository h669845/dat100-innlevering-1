package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {
		
		String bruttoTxt = showInputDialog("Bruttoinntekt:");
		int brutto = parseInt(bruttoTxt);
		
		double trinnskatt = 0;
		
		double betalt = 0;
		
		if(brutto >= 208051 && brutto <= 292850) {
			trinnskatt = 0.017;
			
		} else if(brutto >= 292851 && brutto <= 670000) {
			trinnskatt = 0.04;
			
		} else if(brutto >= 670001 && brutto <= 937900) {
			trinnskatt = 0.136;
			
		} else if(brutto >= 937901 && brutto <= 1350000) {
			trinnskatt = 0.166;
			
		} else if(brutto >= 1350001){
			trinnskatt = 0.176;
            
		} else {
			betalt = 0;
		}
		
		betalt = brutto * trinnskatt;
		
		
		String utTxt = "Trinnskatt: " + trinnskatt + ", Betalt: " + betalt;
		
		showMessageDialog(null, utTxt);

	}

}
