package org.ismek.donguler;

import java.util.Scanner;

public class WhileFaktoriyel {

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.print("Faktoriyel Alınacak Sayı = ");
		int faktoriyelAlinacakSayi = klavyedenOku.nextInt();
		int donguSayaci = 1;
		int sonuc = 1;
		while (faktoriyelAlinacakSayi >= donguSayaci) {
			sonuc = sonuc * donguSayaci;
			donguSayaci++;
		}
		System.out.println("While sonuç =\t" + sonuc);
		
		sonuc = 1;
		for (int donguSayaci2 = 1; donguSayaci2 <= faktoriyelAlinacakSayi; donguSayaci2++) {
			sonuc = sonuc * donguSayaci2;
		}
		System.out.println("For sonuç =\t" + sonuc);
		
		sonuc = 1;
		int donguSayaci3 = 1;
		do {
			sonuc = sonuc * donguSayaci3++;
		} while (donguSayaci3 <= faktoriyelAlinacakSayi);
		System.out.println("Do While sonuç =\t" + sonuc);
	}

}