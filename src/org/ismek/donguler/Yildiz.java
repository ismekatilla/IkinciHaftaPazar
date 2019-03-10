package org.ismek.donguler;

import java.util.Scanner;

public class Yildiz {

	public static void main(String[] args) {
		
		Scanner klavyedenOku = new Scanner(System.in);
		
		System.out.print("Satır giriniz = ");
		int satir = klavyedenOku.nextInt();
		
		System.out.print("Sütun giriniz = ");
		int sutun = klavyedenOku.nextInt();
		
		for (int satirNumarasi = 1; satirNumarasi <= satir; satirNumarasi++) {
			
			for (int sutunNumarasi = 1; sutunNumarasi <= sutun; sutunNumarasi++) {
				System.out.print("*\t");
			}
			System.out.println("");
		}
	}
}