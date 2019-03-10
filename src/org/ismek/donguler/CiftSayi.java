package org.ismek.donguler;

import java.util.Scanner;

public class CiftSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.print("Kaça kadar çift sayı yazdırılacak = ");
		int ciftSayilarKacaKadar = klavyedenOku.nextInt();
		// for ( nereden başlayacak; hangi duruma kadar(nereye kadar); değişim miktarı)
		for (int i = 0; i <= ciftSayilarKacaKadar; i = i + 2) {
			System.out.println(i);
		}
		
		for (; ; ) {
			System.out.println(5);
		}
	}

}
