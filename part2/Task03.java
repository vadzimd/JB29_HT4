package jb29.unit9.part2;

import java.util.Random;
import java.util.Scanner;

// 3. Дана матрица. Вывести на экран первый и последний столбцы.

public class Task03 {

	public static void main(String[] args) {

		int r;
		int c;

		r = enterIntFromConsole("Number of rows");
		c = enterIntFromConsole("Number of columns");

		int[][] array = new int[r][c];

		populateRandomArrayValues(array);

		for (int i = 0; i < array.length; i++) {
				printResult("array [" + i + "][" + 0 + "]", array[i][0]);
		}

		for (int i = 0; i < array.length; i++) {
				printResult("array [" + i + "][" + (array[i].length - 1) + "]", array[i][(array[i].length - 1)]);
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
