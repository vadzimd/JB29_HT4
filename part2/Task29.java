package jb29.unit9.part2;

import java.util.Random;
import java.util.Scanner;

// 29. Найти положительные элементы главной диагонали квадратной матрицы.

public class Task29 {

	public static void main(String[] args) {

		int n;
		int m;

		n = enterIntFromConsole("n");
		m = enterIntFromConsole("m");

		int[][] array = new int[n][m];

		populateRandomArrayValues(array);

		findPositiveDiagonaleElements(array);

	}

	public static void findPositiveDiagonaleElements(int[][] array) {

		printResultStrings("RESULT");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					if (array[i][j] > 0) {
						printResult(array[i][j] + " ");
						;
					}
				}
			}

			System.out.println();
		}
	}

	public static void populateRandomArrayValues(int[][] array) {

		Random rand = new Random();

		printResultStrings("INITIAL");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = rand.nextInt(100);

				if (array[i][j] % 2 == 0) {

					array[i][j] *= (-1);
				}

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
