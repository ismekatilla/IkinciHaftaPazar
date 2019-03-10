package org.ismek.donguler;

import java.util.Scanner;

public class FaktoriyelProgram {

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.print("Faktoriyel Alınacak Sayı Nedir = ");
		int faktoriyelAlinacakSayi = klavyedenOku.nextInt();
		int sonuc = 1;
		for (int i = 1; i <= faktoriyelAlinacakSayi; i++) {
			// 1*1 = 1
			// 1*2 = 2
			// 2*3 = 6
			System.out.println(sonuc + "*" + i + "=" + sonuc * i);
			sonuc = sonuc * i;
		}
		
		System.out.println("Son Sonuç = " + sonuc);
	}
}