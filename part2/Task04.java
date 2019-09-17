package jb29.unit9.part2;

import java.util.Random;
import java.util.Scanner;

// 4. Дана матрица. Вывести на экран первую и последнюю строки.

public class Task04 {

	public static void main(String[] args) {

		int r;
		int c;

		r = enterIntFromConsole("Number of rows");
		c = enterIntFromConsole("Number of columns");

		int[][] array = new int[r][c];

		populateRandomArrayValues(array);

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == 0) {
					printResult("array [" + 0 + "][" + j + "]", array[0][j]);
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == (array.length - 1)) {
					printResult("array [" + (array.length - 1) + "][" + j + "]", array[(array.length - 1)][j]);
				}
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
