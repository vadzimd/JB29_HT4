package jb29.unit9.part2;

import java.util.Random;
import java.util.Scanner;

// 36. Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой
// получается как среднее арифметическое соседей соответствующего элемента исходной матрицы.
// Построить результат сглаживания заданной матрицы

public class Task36 {

	public static void main(String[] args) {

		int n;
		int m;

		n = enterIntFromConsole("n");
		m = enterIntFromConsole("m");

		int[][] array = new int[n][m];

		populateRandomArrayValues(array);

		array = arraySmoother(array);

		printArray(array);

	}

	public static int[][] arraySmoother(int[][] array) {

		int row = array.length;
		if (row == 0)
			return array;

		int width = array[0].length;

		if (width == 0)
			return array;

		int[][] N = new int[row][width];
		for (int i = 0; i < row; ++i) {
			for (int j = 0; j < width; ++j) {
				int sum = 0, c = 0;
				for (int k = Math.max(0, i - 1); k <= Math.min(i + 1, row - 1); k++) {
					for (int u = Math.max(0, j - 1); u <= Math.min(j + 1, width - 1); u++) {
						sum += array[k][u];
						c++;
					}
				}
				N[i][j] = sum / c;
			}
		}
		return N;
	}

	public static void populateRandomArrayValues(int[][] array) {

		Random rand = new Random();

		printResultStrings("INITIAL");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = rand.nextInt(10);

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
