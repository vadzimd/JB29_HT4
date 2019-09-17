package jb29.unit9.part2;

import java.util.Random;
import java.util.Scanner;

// 27. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера
// столбцов вводит пользователь с клавиатуры.

public class Task27 {

	public static void main(String[] args) {

		int n;
		int m;
		int column1;
		int column2;

		n = enterIntFromConsole("n");
		m = enterIntFromConsole("m");

		column1 = enterIntFromConsole("column1") - 1;
		column2 = enterIntFromConsole("column2") - 1;

		int[][] array = new int[n][m];

		populateRandomArrayValues(array);

		changeColumns(array, column1, column2);

		printArray(array);

	}

	public static void changeColumns(int[][] array, int column1, int column2) {

		int[] arrayTemp = new int[array.length];

		for (int i = 0; i < array.length; i++) {

			arrayTemp[i] = array[i][column1];

			array[i][column1] = array[i][column2];

			array[i][column2] = arrayTemp[i];
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
