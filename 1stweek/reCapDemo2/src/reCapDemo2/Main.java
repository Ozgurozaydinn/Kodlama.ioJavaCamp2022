package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = new double[] { 1.2, 6.3, 4.3, 5.6 };
		double total = 0.0;
		double max = myList[0];
		double[] var6 = myList;
		int var7 = myList.length;
		for (int var8 = 0; var8 < var7; ++var8) {
			double number = var6[var8];
			if (max < number) {
				max = number;
			}
			total += number;
			System.out.println(number);
		}
		System.out.println("Toplam = " + total);
		System.out.println("En Büyük = " + max);

	}

}
