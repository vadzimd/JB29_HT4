package jb29.unit9.part1;

import java.util.Random;

import java.util.Scanner;

// 5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте.

public class Task05 {

	public static void main(String[] args) {

		int n;
		int counter;

		n = enterIntFromConsole("N");

		int[] array = new int[n];

		populateRandomArrayValues(array);

		counter = calcEven(array);
		
		if (counter == 0) {
			System.out.println("No even numbers in the sequence.");
			System.exit(0);
		}

		int[] arrayEven = new int[counter];

		createEvenArray(array, arrayEven);

	}

	public static int calcEven(int[] array) {
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				counter++;
			}
		}

		return counter;

	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);

			printResult("array [" + i + "]", array[i]);

		}
	}

	public static void createEvenArray(int[] array, int[] arrayEven) {
		int j = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {

				array[j] = array[i];

				printResult("arrayEven [" + j + "]", array[j]);

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
