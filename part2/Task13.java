package jb29.unit9.part2;

import java.util.Scanner;

// 13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task13 {

	public static void main(String[] args) {

		int n;

		n = enterIntFromConsole("even n");

		int[][] array = new int[n][n];

		populateArrayValues(array);

	}

	public static void populateArrayValues(int[][] array) {

		System.out.println("-------RESULT-----------");
		System.out.println("------------------------");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i % 2 == 0) {
					array[i][j] = j + 1;

					printResult(array[i][j] + " ");
				} else {
					array[i][j] = array[i].length - j;
					printResult(array[i][j] + " ");
				}
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
