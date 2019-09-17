package jb29.unit9.part2;

import java.util.Random;
import java.util.Scanner;

// 26. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия:
//а) вычислить сумму отрицательных элементов в каждой строке;
//б) определить максимальный элемент в каждой строке;
//в) переставить местами максимальный и минимальный элементы матрицы.

public class Task26 {

	public static void main(String[] args) {

		int n;
		int m;

		int[] maxElementPos = new int[2];
		int[] minElementPos = new int[2];

		int tempElement;

		n = enterIntFromConsole("n");
		m = enterIntFromConsole("m");

		int[][] array = new int[n][m];

		populateRandomArrayValues(array);

		calcSumNegativeElements(array);
		calcMaxElements(array);

		maxElementPos = findMaxElements(array);
		minElementPos = findMinElements(array);

		tempElement = array[maxElementPos[0]][maxElementPos[1]];

		array[maxElementPos[0]][maxElementPos[1]] = array[minElementPos[0]][minElementPos[1]];
		array[minElementPos[0]][minElementPos[1]] = tempElement;

		printResultStrings("RESULT");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				printResult(array[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println("------------------------");
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

	public static int[] findMaxElements(int[][] array) {
		int maxElement;
		int[] maxElementPos = new int[2];
		maxElement = array[0][0];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				if (array[i][j] > maxElement) {

					maxElement = array[i][j];

					maxElementPos[0] = i;
					maxElementPos[1] = j;
					;
				}
			}
		}
		return maxElementPos;

	}

	public static int[] findMinElements(int[][] array) {
		int minElement;
		int[] minElementPos = new int[2];

		minElement = array[0][0];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				if (array[i][j] < minElement) {

					minElement = array[i][j];

					minElementPos[0] = i;
					minElementPos[1] = j;
					;
				}
			}
		}
		return minElementPos;

	}

	public static void calcMaxElements(int[][] array) {
		int maxElement;

		printResultStrings("RESULT");

		for (int i = 0; i < array.length; i++) {

			maxElement = array[i][0];

			for (int j = 0; j < array[i].length; j++) {

				if (array[i][j] > maxElement) {
					maxElement = array[i][j];
					;
				}
			}

			printResult("Maximum element of [" + i + "] row is " + maxElement);
			System.out.println();
		}

		System.out.println("------------------------");

	}

	public static void calcSumNegativeElements(int[][] array) {
		int sum = 0;

		printResultStrings("RESULT");

		for (int i = 0; i < array.length; i++) {
			sum = 0;
			for (int j = 0; j < array[i].length; j++) {

				if (array[i][j] < 0) {
					sum += array[i][j];
					;
				}
			}

			printResult("Sum of negative elements of [" + i + "] row is" + sum);
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