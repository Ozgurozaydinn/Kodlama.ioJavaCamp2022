package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "    Bugün hava çok güzel.    ";
		System.out.println(mesaj);
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));
		String[] var3 = mesaj.split(" ");
		int var4 = var3.length;
		for (int var5 = 0; var5 < var4; ++var5) {
			String kelime = var3[var5];
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
	}

}
