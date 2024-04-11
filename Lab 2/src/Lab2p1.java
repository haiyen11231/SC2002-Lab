import java.util.Scanner;
import java.util.Random;

public class Lab2p1 {
	
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();   
		
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: multiplication test");
			System.out.println("2: quotient using division by subtraction");
			System.out.println("3: remainder using division by subtraction");
			System.out.println("4: count the number of digits");
			System.out.println("5: position of a digit");
			System.out.println("6: extract all odd digits");
			System.out.println("7: quit");
			choice = sc.nextInt();
			switch (choice) {
				case 1: /* add mulTest() call */
					mulTest();
					break;
				case 2: /* add divide() call */
					System.out.println("Input two positive integers: ");
					System.out.print("m = ");
					int m = sc.nextInt();
					System.out.print("n = ");
					int n = sc.nextInt();
					int ans = divide(m, n);
					System.out.println(m + "/" + n + " = " + ans);
					break;
				case 3: /* add modulus() call */
					System.out.println("Input two positive integers: ");
					System.out.print("m = ");
					m = sc.nextInt();
					System.out.print("n = ");
					n = sc.nextInt();
					ans = modulus(m, n);
					System.out.println(m + " % " + n + " = " + ans);
					break;
				case 4: /* add countDigits() call */
					System.out.println("Input one positive integer: ");
					System.out.print("n : ");
					n = sc.nextInt();
					if (n < 0) {
						System.out.println("n : " + n + " - Error input!!");
					} else {
						ans = countDigits(n);
						System.out.println("n : " + n + " - count = " + ans);
					}
					break;
				case 5: /* add position() call */
					System.out.println("Input one positve integer: ");
					n = sc.nextInt();
					System.out.println("Input one digit: ");
					int digit = sc.nextInt();
					ans = position(n, digit);
					System.out.println("position = " + ans);
					break;
				case 6: /* add extractOddDigits() call */
					System.out.println("Input one positve integer: ");
					long a = sc.nextInt();
					if (a < 0) {
						System.out.println("oddDigits = Error input!!");
					} else {
						long result = extractOddDigits(a);
						System.out.println("oddDigits = " + result);
					}
					break;
				case 7: System.out.println("Program terminating ….");
			}
		} while (choice < 7);
	}
	
		 /* add method code here */
	public static void mulTest() {
		final int MAX = 10, MIN = 1, TRIALS = 5; // MAX is exclusive
		int correctAns = 0;
		Scanner sc = new Scanner(System.in);
		Random random = new Random(); 
		
		for (int i = 0; i < TRIALS; i++) {
//			Generate random number between 1 and 9 (both inclusive)
			int a = random.nextInt(MAX - MIN)+ MIN;
			int b = random.nextInt(MAX - MIN)+ MIN;
			System.out.print("How much is " + a + " times " + b + "?");
			int ans = sc.nextInt();
			if (ans == a * b) correctAns++;
		}
		
		System.out.println(correctAns + " answers out of " + TRIALS + " are correct.");
	}
	
	public static int divide(int m, int n) {
		int ans = 0;
		while (m >= n) {
			m -= n;
			ans++;
		}
		return ans;
	}
	
	public static int modulus(int m, int n) {
		while (m >= n) {
			m -= n;
		}
		return m;
	}
	
	public static int countDigits(int n) {
		int digits = 0;
		while (n > 0) {
			n /= 10;
			digits++;
		}
		return digits;
	}
	
	public static int position(int n, int digit) {
		int position = 0;
		while (n > 0) {
			position++;
			int lastDigit = n % 10;
			if (lastDigit == digit) return position;
			n /= 10;
		}
		return -1;
	}
	
	public static long extractOddDigits(long n) {
		String oddDigits = "";
		while (n > 0) {
			long lastDigit = n % 10;
			if (lastDigit % 2 == 1) oddDigits = lastDigit + oddDigits;
			n /= 10;
		}
		
		return oddDigits.equals("") ? -1 : Long.parseLong(oddDigits);
	}
}
