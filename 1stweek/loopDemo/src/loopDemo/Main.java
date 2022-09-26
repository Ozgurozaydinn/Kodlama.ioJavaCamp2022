package loopDemo;

public class Main {

	public static void main(String[] args) {
		int i;
        for(i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Döngü Bitti");
        for(i = 1; i < 10; ++i) {
            System.out.println(i);
        }
        System.out.println("While Döngüsü Bitti");
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while(j < 10);
        System.out.println("D0-While Döngüsü Bitti");

	}

}
