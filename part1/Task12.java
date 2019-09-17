package jb29.unit9.part1;

import java.util.Random;
import java.util.Scanner;

// 12. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.

public class Task12 {

	public static void main(String[] args) {

		int n;

		n = enterIntFromConsole("N");

		double[] array = new double[n];

		populateRandomArrayValues(array);

		calcSumPrimeNumbers(array);

	}

	public static void calcSumPrimeNumbers(double[] array) {

		boolean indicator;
		double sum = 0;

		for (int i = 2; i < array.length; i++) {

			indicator = true;

			for (int j = i - 1; j > 1; j--) {

				if (i % j == 0) {
					indicator = false;
					continue;
				}

			}
			if (indicator == true) {

				sum = Double.sum(sum, array[i]);
			}

		}
		printResult("Sum of values of prime array numbers", sum);

	}

	public static void populateRandomArrayValues(double[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {

			array[i] = rand.nextDouble();

			printResult("array [" + i + "]", array[i]);

		}
	}

	public static void printResult(String message, double value) {

		System.out.println(message + " is " + value);
	}

	public static int enterIntFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int number;

		System.out.print("Enter " + message + ": ");

		while (!scanner.hasNextInt()) {
			scanner.next();

			System.out.print("Enter " + message + ": ");
		}
		number = scanner.nextInt();

		return number;

	}

}
