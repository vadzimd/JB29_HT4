package jb29.unit9.part2;

import java.util.Scanner;

// 12. Получить квадратную матрицу порядка n:

public class Task12 {

	public static void main(String[] args) {

		int n;

		n = enterIntFromConsole("n");

		int[][] array = new int[n][n];

		populateArrayValues(array);

	}

	public static void populateArrayValues(int[][] array) {

		System.out.println("-------RESULT-----------");
		System.out.println("------------------------");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					array[i][j] = j;

					printResult(array[i][j] + " ");
				} else {
					array[i][j] = 0;
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
