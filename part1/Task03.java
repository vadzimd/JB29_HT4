package jb29.unit9.part1;

import java.util.Random;
import java.util.Scanner;

// 3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или отрицательное.

public class Task03 {

	public static void main(String[] args) {

		int n;

		n = enterIntFromConsole("N");

		int[] array = new int[n];

		populateRandomArrayValues(array);

		checkSign(array);

	}

	public static void checkSign(int[] array) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				if (array[i] < 0) {
					printResult("First number is negative", array[i]);
					break;
				} else {
					printResult("First number is positive", array[i]);
					break;
				}
			}
		}

	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);

			if (array[i] % 2 == 0) {

				array[i] = (-1) * array[i];
			}
			;

			printResult("array [" + i + "]", array[i]);

		}
	}

	public static void printResult(String message, int value) {

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
