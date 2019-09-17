package jb29.unit9.part2;

import java.util.Scanner;

// 23. Сформировать квадратную матрицу порядка N по правилу:

public class Task23 {

	public static void main(String[] args) {

		int n;

		n = enterIntFromConsole("even n");

		double[][] array = new double[n][n];

		populateArrayValues(array, n);

	}

	public static void populateArrayValues(double[][] array, int n) {
		int counter = 0;

		System.out.println("-------RESULT-----------");
		System.out.println("------------------------");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = Math.sin((i * i - j * j) / n);

				if (array[i][j] > 0) {

					counter++;
				}

				printResult(array[i][j] + " ");
			}

			System.out.println();

		}
		System.out.println("------------------------");

		printResult("The number of positive values is " + counter);
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
