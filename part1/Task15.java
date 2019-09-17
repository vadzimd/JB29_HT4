package jb29.unit9.part1;

import java.util.Random;
import java.util.Scanner;

// 15. Дана последовательность действительных чисел n a ,a , ,a 1 2  . Указать те ее элементы, которые принадлежат отрезку [с, d].

public class Task15 {

	public static void main(String[] args) {

		int n;
		int c;
		int d;

		n = enterIntFromConsole("N");
		c = enterIntFromConsole("c");
		d = enterIntFromConsole("d");

		double[] array = new double[n];

		populateRandomArrayValues(array);

		findInSectionCD(array, c, d);

	}

	public static void findInSectionCD(double[] array, int c, int d) {
		boolean isResult = false;

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= (double) c && (array[i] <= (double) d)) {
				printResult("Resulted array [" + i + "]", array[i]);
				isResult = true;
			}

		}

		if (isResult == false) {
			System.out.println("No such values");
		}
	}

	public static void populateRandomArrayValues(double[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextDouble() * rand.nextInt(1000);

			printResult("Initial array [" + i + "]", array[i]);

		}
	}

	public static void printResult(String message, double value) {

		System.out.println(message + " is " + value);
	}

	public static int enterIntFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.println("Enter " + message + ": ");

		while (!scanner.hasNextInt()) {
			scanner.next();

			System.out.println("Enter " + message + ": ");
		}
		number = scanner.nextInt();

		return number;

	}

}
