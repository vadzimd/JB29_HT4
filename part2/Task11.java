package jb29.unit9.part2;

import java.util.Random;
import java.util.Scanner;

// 11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая строка слева направо, третья строка справа налево и так далее.

public class Task11 {

	public static void main(String[] args) {

		int r;
		int c;

		r = enterIntFromConsole("Number of rows");
		c = enterIntFromConsole("Number of columns");

		int[][] array = new int[r][c];

		populateRandomArrayValues(array);

		printElementByDiffOrder(array);

	}

	public static void printElementByDiffOrder(int[][] array) {
		
		System.out.println("-------RESULT-----------");
		
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {

				for (int j = 0; j < array[i].length; j++) {

					printResult(array[i][j] + " ");
				}
			} else {

				for (int j = array[i].length - 1; j >= 0; j--) {

					printResult(array[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------");

	}

	public static void populateRandomArrayValues(int[][] array) {

		Random rand = new Random();

		System.out.println("-------INITIAL----------");
		System.out.println("------------------------");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = rand.nextInt(10);

				printResult(array[i][j] + " ");
			}
			System.out.println();

		}
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
