package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 65;
        switch (harf) {
            case 65:
            case 73:
            case 79:
            case 85:
                System.out.println("Kalın Sesli Harf");
                break;
            default:
                System.out.println("İnce Sesli Harf");
        }

	}

}
