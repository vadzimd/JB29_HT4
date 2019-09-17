package jb29.unit9.part2;

import java.util.Random;
import java.util.Scanner;

// 37. Переставить строки матрицы случайным образом.

public class Task37 {

	public static void main(String[] args) {

		int r;
		int c;

		r = enterIntFromConsole("Number of rows");
		c = enterIntFromConsole("Number of columns");

		int[][] array = new int[r][c];

		populateRandomArrayValues(array);

		changeRandomArrayRows(array);

		printArray(array);
	}

	public static void changeRandomArrayRows(int[][] array) {
		int r1;
		int r2;
		int l = 0;
		int[] arrayTemp = new int[array.length];

		Random rand = new Random();

		r1 = rand.nextInt(array.length - 1);
		r2 = rand.nextInt(array.length - 1);

		for (int i = r1; i < r1 + 1; i++) {
			for (int j = 0; j < array[i].length; j++) {

				arrayTemp[l] = array[r1][j];

				array[r1][j] = array[r2][j];

				array[r2][j] = arrayTemp[l];

				l++;
			}

		}
	}

	public static void populateRandomArrayValues(int[][] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = rand.nextInt(10);
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
