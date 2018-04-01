package modelo;

import javax.swing.*;

public class NumRom {
	public static void main(String[] args) {

		String unidades = "";
		String decenas = "";
		String centenas = ""; 
		String miles = "";
		
		int unidad;
		int decena;
		int centena; 
		int mil; 
		int entero;

	try {
			do {
				entero =Integer.parseInt(JOptionPane.showInputDialog( "Ingrese numero del 1 al 1000:"));

		 } while (entero < 1 || entero > 1000);
			
		

		mil = entero / 1000;
		centena = (entero % 1000) / 100;
		decena = ((entero % 1000) % 100) / 10;
		unidad = (((entero % 1000) % 100) % 10);
		
		switch (mil) {
			case 1:
			miles += "M";
			break;
			}
			
			switch (centena) {
			case 1:
			centenas += "C";
			break;
			case 2:
			centenas += "CC";
			break;
			case 3:
			centenas += "CCC";
			break;
			case 4:
			centenas += "CD";
			break;
			case 5:
			centenas += "D";
			break;
			case 6:
			centenas += "DC";
			break;
			case 7:
			centenas += "DCC";
			break;
			case 8:
			centenas += "DCCC";
			break;
			case 9:
			centenas += "CM";
			break;
			}
			
			switch (decena) {
			case 1:
			decenas += "X";
			break;
			case 2:
			decenas += "XX";
			break;
			case 3:
			decenas += "XXX";
			break;
			case 4:
			decenas += "XL";
			break;
			case 5:
			decenas += "L";
			break;
			case 6:
			decenas += "LX";
			break;
			case 7:
			decenas += "LXX";
			break;
			case 8:
			decenas += "LXXX";
			break;
			case 9:
			decenas += "XC";
			break;
			}
			
			switch (unidad) {
			case 1:
			unidades += "I";
			break;
			case 2:
			unidades += "II";
			break;
			case 3:
			unidades += "III";
			break;
			case 4:
			unidades += "IV";
			break;
			case 5:
			unidades += "V";
			break;
			case 6:
			unidades += "VI";
			break;
			case 7:
			unidades += "VII";
			break;
			case 8:
			unidades += "VIII";
			break;
			case 9:
			unidades += "IX";
			break;
			}
		
		JOptionPane.showMessageDialog(null, "El numero ingresado: " + entero + " convertido a romano es: " + miles + centenas + decenas + unidades);
	} catch (Exception e) {
		
		JOptionPane.showMessageDialog(null, "El número que ingresaste esta fuera del rango",
				  "FUERA DEL RANGO!!!", JOptionPane.ERROR_MESSAGE);
	}	
	}



	}
