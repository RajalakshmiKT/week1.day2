package week1.day2;

public class Fibonacciseries {
	public static void main(String[] args) {
		int a = 0, b = 1, sum;
		System.out.println("Fibonacci Series:");
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i <= 5; i++) {
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;

		}
	}

}
