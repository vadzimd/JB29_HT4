package jb29.unit9.part2;

import java.util.Random;
import java.util.Scanner;

// 24. Дан линейный массив n n x , x , , x , x 1 2 −1  . Получить действительную квадратную матрицу порядка n:

public class Task24 {

	public static void main(String[] args) {

		int n;

		n = enterIntFromConsole("even n");

		int[] array = new int[n];

		populateRandomArrayValues(array);

		populateArrayValues(array);

	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		System.out.println("-------INITIAL----------");
		System.out.println("------------------------");

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);

			printResult(array[i] + " ");

		}
		System.out.println("------------------------");
	}

	public static void populateArrayValues(int[] array) {
		int l;

		System.out.println("-------RESULT-----------");
		System.out.println("------------------------");

		double[][] arrayResult = new double[array.length][array.length];

		for (int i = 0; i < arrayResult.length; i++) {
			l = 0;
			for (int j = 0; j < arrayResult[i].length; j++) {

				arrayResult[i][j] = Math.pow(array[l], i + 1);
				l++;

				printResult(arrayResult[i][j] + " ");
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
