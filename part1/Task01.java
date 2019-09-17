package jb29.unit9.part1;

import java.util.Random;
import java.util.Scanner;

// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class Task01 {

	public static void main(String[] args) {

		int n;
		int k;

		n = enterIntFromConsole("N");
		k = enterIntFromConsole("K");

		int[] array = new int[n];

		populateRandomArrayValues(array);

		calcSum(array, k);

	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);

			printResult("array [" + i + "]", array[i]);

		}
	}

	public static void calcSum(int[] array, int k) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % k == 0) {

				sum += array[i];
			}
		}

		printResult("Sum ", sum);

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
