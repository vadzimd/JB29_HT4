package jb29.unit9.part2;

import java.util.Random;
import java.util.Scanner;

// 39. Найдите произведение двух матриц.

public class Task39 {

	public static void main(String[] args) {

		int r;
		int c;

		r = enterIntFromConsole("Number of rows");
		c = enterIntFromConsole("Number of columns");

		int[][] array1 = new int[r][c];
		int[][] array2 = new int[r][c];
		int[][] array3 = new int[r][c];

		populateRandomArrayValues(array1);
		populateRandomArrayValues(array2);

		multArrays(array1, array2, array3);

		printArray(array3);
	}

	public static void multArrays(int[][] array1, int[][] array2, int[][] array3) {

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {

				array3[i][j] = array1[i][j] * array2[i][j];
			}

		}
	}

	public static void populateRandomArrayValues(int[][] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = rand.nextInt(100);
			}

		}

		printResultStrings("INITIAL");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				printResult(array[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println("------------------------");
	}

	public static void printArray(int[][] array) {

		printResultStrings("RESULT");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				printResult(array[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println("------------------------");
	}

	public static void printResultStrings(String value) {
		System.out.println("------------------------");
		System.out.println("-------" + value + "-----------");
		System.out.println("------------------------");
	}

	public static void printResult(String message) {

		System.out.print(message);
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
