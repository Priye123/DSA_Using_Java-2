package standardproblems;

import java.util.Scanner;

public class NumberSystem {

	public static void main(String[] args) {
		// decimalToAnyBase();
		// anyBaseToDecimal();
		anyBasetoanyBase();
	}

	private static void anyBasetoanyBase() {
		Scanner sc = new Scanner(System.in);
		int givenNumber = sc.nextInt();
		int givenbase = sc.nextInt();
		int convertToBase = sc.nextInt();

		int decimalNumber = anyBaseToDecimal(givenNumber, givenbase);

		System.out.println(decimalToAnyBase(decimalNumber, convertToBase));

	}

	public static int decimalToAnyBase(int decimalNumber, int baseToconvert) {

		int power = 0, convertedNumber = 0;

		while (decimalNumber != 0) {
			convertedNumber = convertedNumber + (decimalNumber % baseToconvert) * (int) Math.pow(10, power);
			decimalNumber /= baseToconvert;
			power++;
		}
		return convertedNumber;
	}

	private static int anyBaseToDecimal(int givenNumber, int givenbase) {
		int power = 0;
		int decimalNumber = 0;

		while (givenNumber != 0) {
			decimalNumber = decimalNumber + (givenNumber % 10) * (int) Math.pow(givenbase, power);
			givenNumber /= 10;
			power++;
		}
		// System.out.println(decimalNumber);
		return decimalNumber;
	}

	private static void anyBaseToDecimal() {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int baseNumber = sc.nextInt(), power = 0;
		int decimalNumber = 0;

		while (baseNumber != 0) {
			decimalNumber = decimalNumber + (baseNumber % 10) * (int) Math.pow(base, power);
			baseNumber /= 10;
			power++;
		}
		System.out.println(decimalNumber);
	}

	public static void decimalToAnyBase() {
		Scanner sc = new Scanner(System.in);
		int decimalNumber = sc.nextInt();
		int baseToconvert = sc.nextInt();
		int power = 0, convertedNumber = 0;

		while (decimalNumber != 0) {
			convertedNumber = convertedNumber + (decimalNumber % baseToconvert) * (int) Math.pow(10, power);
			decimalNumber /= baseToconvert;
			power++;
		}
		System.out.println(convertedNumber);
	}

}
