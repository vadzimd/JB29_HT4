package jb29.unit9.part2;

import java.util.Random;
import java.util.Scanner;

// 34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.

public class Task35 {

	public static void main(String[] args) {

		int n;
		int m;
		int maxValue;

		n = enterIntFromConsole("n");
		m = enterIntFromConsole("m");

		int[][] array = new int[n][m];

		populateRandomArrayValues(array);

		maxValue = findMaximum(array);

		replaceOddByMaximum(array, maxValue);

		printArray(array);

	}

	public static int findMaximum(int[][] array) {
		int maxValue = array[0][0];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length - 1; j++) {
				if (array[i][j] > maxValue)
					maxValue = array[i][j];
			}
		}
		return maxValue;
	}

	public static void replaceOddByMaximum(int[][] array, int maxValue) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length - 1; j++) {
				if (array[i][j] % 2 != 0 || (array[i][j] == 1))
					array[i][j] = maxValue;
			}
		}
	}

	public static void populateRandomArrayValues(int[][] array) {

		Random rand = new Random();

		printResultStrings("INITIAL");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = rand.nextInt(100);

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
