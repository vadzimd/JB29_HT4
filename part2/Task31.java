package jb29.unit9.part2;

import java.util.Scanner;

// 31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.

public class Task31 {

	public static void main(String[] args) {

		int[][] array = new int[10][100];

		populateArrayValues(array);

		find2DigitsElements(array);

	}

	public static void find2DigitsElements(int[][] array) {
		int counter = 0;

		printResultStrings("RESULT");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				if (array[i][j] >= 10 && array[i][j] < 100) {
					counter++;
				}
			}
		}

		printResult("Count of 2-digits numbers is " + counter);
		System.out.println();

	}

	public static void populateArrayValues(int[][] array) {
		int order = 0;

		printResultStrings("RESULT");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = order;
				order++;

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
