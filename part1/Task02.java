package jb29.unit9.part1;

import java.util.Random;

import java.util.Scanner;

// 2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.

public class Task02 {

	public static void main(String[] args) {

		int n;
		int counter;

		n = enterIntFromConsole("N");

		int[] array = new int[n];

		populateRandomArrayValues(array);

		counter = calcZero(array);

		int[] arrayZero = new int[counter];

		createZeroArray(array, arrayZero);

	}

	public static int calcZero(int[] array) {
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				counter++;
			}
		}

		return counter;

	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
			
			if (array[i] % 2 == 0) {

				array[i] = 0;
			}
			;

			printResult("array [" + i + "]", array[i]);

		}
	}

	public static void createZeroArray(int[] array, int[] arrayZero) {
		int j = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] == 0) {

				array[j] = i;
				
				printResult("arrayZero [" + j + "]", array[j]);
				
				j++;
			}
			
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
