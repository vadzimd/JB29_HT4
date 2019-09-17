package jb29.unit9.part2;

import java.util.Random;
import java.util.Scanner;

// 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task10 {

	public static void main(String[] args) {

		int r;
		int c;
		int k;
		int p;

		r = enterIntFromConsole("Number of rows");
		c = enterIntFromConsole("Number of columns");

		k = enterIntFromConsole("k") - 1;
		p = enterIntFromConsole("p") - 1;

		int[][] array = new int[r][c];

		populateRandomArrayValues(array);
		printElementByRow(array, k, p);

	}

	public static void printElementByRow(int[][] array, int k, int p) {

		for (int i = k; i < k + 1; i++) {
			for (int j = 0; j < array[i].length; j++) {
				printResult("array [" + i + "][" + j + "]", array[i][j]);
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = p; j < p + 1; j++) {
				printResult("array [" + i + "][" + j + "]", array[i][j]);
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
