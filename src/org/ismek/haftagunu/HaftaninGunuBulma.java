package org.ismek.haftagunu;

import java.util.Random;

public class HaftaninGunuBulma {

	public static void main(String[] args) {
		Random random = new Random();
		int rastgeleGunNumarasi = random.nextInt(7);
		System.out.println(rastgeleGunNumarasi);
		switch (rastgeleGunNumarasi) {
		case 0:
			System.out.println("PAZARTESİ");
			break;
		case 1:
			System.out.println("SALI");
		case 2:
			System.out.println("ÇARŞAMBA");
			break;
		case 3:
			System.out.println("PERŞEMBE");
			break;
		case 4:
			System.out.println("CUMA");
			break;
		case 5:
			System.out.println("CUMARTESİ");
			break;
		case 6:
			System.out.println("PAZAR");
			break;
		default:
			System.out.println("GÜN BULUNAMADI");
			break;
		}
	}
}