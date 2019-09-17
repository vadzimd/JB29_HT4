package jb29.unit9.part2;

import java.util.Random;
import java.util.Scanner;

// 30. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.

public class Task30 {

	public static void main(String[] args) {

		int n;
		int m;

		n = enterIntFromConsole("n");
		m = enterIntFromConsole("m");

		int[][] array = new int[n][m];

		populateRandomArrayValues(array);

		find5Elements(array);

	}

	public static void find5Elements(int[][] array) {
		int counter;

		printResultStrings("RESULT");

		for (int i = 0; i < array.length; i++) {
			counter = 0;
			for (int j = 0; j < array[i].length; j++) {

				if (array[i][j] == 5) {
					counter++;
				}
			}
			if (counter >= 3) {
				printResult("Count of 5 number is " + counter + " in row number #" + (i + 1));
				System.out.println();
			}
		}
	}

	public static void populateRandomArrayValues(int[][] array) {

		Random rand = new Random();

		printResultStrings("INITIAL");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = rand.nextInt(16);

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
