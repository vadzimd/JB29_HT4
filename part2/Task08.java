package jb29.unit9.part2;

import java.util.Random;
import java.util.Scanner;

// 8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива.

public class Task08 {

	public static void main(String[] args) {

		int r;
		int c;

		r = enterIntFromConsole("Number of rows");
		c = enterIntFromConsole("Number of columns");

		int[][] array = new int[r][c];

		populateRandomArrayValues(array);

		calcEqualSevenElements(array);
	}

	public static void calcEqualSevenElements(int[][] array) {
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 7) {

					counter++;
				}
			}
		}

		printResult("The number of elements which are 7", counter);

	}

	public static void populateRandomArrayValues(int[][] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = rand.nextInt(10);

				printResult("Initial array [" + i + "][" + j + "]", array[i][j]);
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
