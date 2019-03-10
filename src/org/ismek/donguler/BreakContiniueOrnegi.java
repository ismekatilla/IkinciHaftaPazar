package org.ismek.donguler;

public class BreakContiniueOrnegi {

	public static void main(String[] args) {
		
		int sonuc = 1;
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0) {
				continue;
			}
			sonuc = sonuc * i;
			
			if (i == 4) {
				break;
			}
		}
		System.out.println(sonuc);
		
		
		ilkFor : for (int i = 0; i < 10; i++) {
			ikinciFor : for (int j = 0; j < 15; j++) {
				if (j==3) {
					break ilkFor;
				}
			}
			
		}
	}
}