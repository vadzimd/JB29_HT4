package jb29.unit9.part1;

import java.util.Random;
import java.util.Scanner;

// 18. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, то определить наименьшее из них.

public class Task18 {

	public static void main(String[] args) {

		int n;

		n = enterIntFromConsole("N");

		int[] array = new int[n];

		populateRandomArrayValues(array);

		findMostFrequentNumber(array);

	}

	public static void findMostFrequentNumber(int[] array) {

		int numMax = array[0];
		int maxCounter = 0;
		int num = array[0];
		int counter;

		for (int i = 0; i < array.length; i++) {
			counter = 0;
			for (int j = 0; j < array.length; j++) {

				if (array[i] == array[j]) {

					counter++;
					num = array[i];
				}
			}

			if (counter > maxCounter) {
				maxCounter = counter;
				numMax = array[i];

			} else if (counter == maxCounter) {
				if (num < numMax) {
					numMax = num;
				}
			}

		}

		printResult("Number", numMax);
		printResult("Count", maxCounter);
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
