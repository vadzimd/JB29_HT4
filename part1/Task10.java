package jb29.unit9.part1;

import java.util.Random;
import java.util.Scanner;

// 10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task10 {

	public static void main(String[] args) {

		int n;

		n = enterIntFromConsole("N");

		int[] array = new int[n];

		populateRandomArrayValues(array);

		findBiggerI(array);

	}

	public static void findBiggerI(int[] array) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] > i) {
				printResult("Resulted array [" + i + "]", array[i]);
			}
		}

	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);

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
