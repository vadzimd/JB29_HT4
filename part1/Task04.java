package jb29.unit9.part1;

import java.util.Random;
import java.util.Scanner;

// 4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.

public class Task04 {

	public static void main(String[] args) {

		int n;

		n = enterIntFromConsole("N");

		int[] array = new int[n];

		populateRandomArrayValues(array);

		if (checkSign(array) == true) {
			System.out.println("The sequence is rising.");
		} else {
			System.out.println("The sequence is not rising.");
		}

	}

	public static boolean checkSign(int[] array) {

		int numPrev = array[0];
		boolean isSequenceRising = true;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < numPrev) {
				isSequenceRising = false;
				return isSequenceRising;
			}
			numPrev = array[i];
		}
		return isSequenceRising;

	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);

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
