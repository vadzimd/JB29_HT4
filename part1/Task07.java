package jb29.unit9.part1;

import java.util.Random;
import java.util.Scanner;

// 7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.

public class Task07 {

	public static void main(String[] args) {

		int n;
		int z;

		n = enterIntFromConsole("N");
		z = enterIntFromConsole("Z");

		int[] array = new int[n];

		populateRandomArrayValues(array);

		replaceZ(array, z);
	}

	public static void replaceZ(int[] arrayZ, int z) {
		int counter = 0;
		for (int i = 0; i < arrayZ.length; i++) {
			if (arrayZ[i] > z) {
				arrayZ[i] = z;
				counter++;
			}
			printResult("arrayZ [" + i + "]", arrayZ[i]);
		}
		printResult("counter", counter);

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
