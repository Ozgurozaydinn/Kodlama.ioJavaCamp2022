package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Engin";
        String ogrenci2 = "Özgür";
        String ogrenci3 = "Özalp";
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println("-------------");
        String[] ogrenciler = new String[]{"Engin", "Özgür", "Özalp", "Ali", "Doğukan"};
        for(int i = 0; i < ogrenciler.length; ++i) {
            System.out.println(ogrenciler[i]);
        }
        String[] var9 = ogrenciler;
        int var6 = ogrenciler.length;
        for(int var7 = 0; var7 < var6; ++var7) {
            String ogrenci = var9[var7];
            System.out.println(ogrenci);
        }

	}

}
