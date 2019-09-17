package jb29.unit9.part1;

import java.util.Random;
import java.util.Scanner;

// 6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.

public class Task06 {

	public static void main(String[] args) {

		int n;
		int numMax;
		int numMin;

		n = enterIntFromConsole("N");

		int[] array = new int[n];

		populateRandomArrayValues(array);

		numMax = findMax(array);
		numMin = findMin(array);

		printResult("The minimum distance", numMax - numMin);

	}

	public static int findMax(int[] array) {

		int numMax = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > numMax) {
				numMax = array[i];
			}
		}
		return numMax;

	}

	public static int findMin(int[] array) {

		int numMin = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < numMin) {
				numMin = array[i];
			}
		}
		return numMin;

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
