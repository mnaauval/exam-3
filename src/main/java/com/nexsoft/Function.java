package com.nexsoft;

import java.text.DecimalFormat;

public class Function {

	public double circumtancePool(double panjang, double lebar, double tinggi) {
		if (panjang < 0 || lebar < 0 || tinggi < 0) {
			return Math.abs((panjang + lebar + tinggi) * 4);
		} else {
			return (panjang + lebar + tinggi) * 4;			
		}
		
	}
	
	public double volumePool(double panjang, double lebar, double tinggi) {
		if (panjang < 0 || lebar < 0 || tinggi < 0) {
			return Math.abs(panjang * lebar * tinggi);
		}  else {			
			return panjang * lebar * tinggi;
		}
		
	}
	
	
	public double fahToCel(double fahn) {
		double hasil;
		hasil = (fahn - 32) * 5 / 9;
		String hasilTemp;
		DecimalFormat numberFormatNegatif = new DecimalFormat("#.000000000");
		DecimalFormat numberFormatPositif = new DecimalFormat("#.00000000");
		
		if (fahn < 0) {
			fahn = Math.abs((int) fahn);
			return (fahn - 32) * 5 / 9;
		} else {			
			return (fahn - 32) * 5 / 9;
		}
	}
	
	static void checkIsNan(double p, double l, double t) throws NumberFormatException {
		throw new NumberFormatException("Error");
	}
}
