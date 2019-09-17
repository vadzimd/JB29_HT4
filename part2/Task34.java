package jb29.unit9.part2;


import java.util.Scanner;

// 34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.

public class Task34 {

	public static void main(String[] args) {

		int n;
		int m;

		n = enterIntFromConsole("n");
		m = enterIntFromConsole("m");

		int[][] array = new int[n][m];

		populateRandomArrayValues(array);
		printArray(array);

	}

	public static void sortArrayElemetnsRow(int[][] array) {
		int tmpValue = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length - 1; j++) {
				for (int k = 0; k < array[i].length - 1; k++) {

					if (array[k + 1][i] < array[k][i]) {

						tmpValue = array[k + 1][i];
						array[k + 1][i] = array[k][i];
						array[k][i] = tmpValue;
					}
				}

			}
		}
	}

	public static void populateRandomArrayValues(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				array[i][j] = 0;

			}

			for (int j = i; j < array[i].length; j++) {
				array[i][j] = 1;

			}

		}
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
