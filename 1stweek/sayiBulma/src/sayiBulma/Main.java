package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMi = false;
		int[] var4 = sayilar;
		int var5 = sayilar.length;
		for (int var6 = 0; var6 < var5; ++var6) {
			int sayi = var4[var6];
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayı Mevcuttur.");
		} else {
			System.out.println("Sayı Mevcut Değildir.");
		}

	}

}
