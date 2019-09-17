package jb29.unit9.part2;

import java.util.Random;
import java.util.Scanner;

// 32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task32 {

	public static void main(String[] args) {

		int n;
		int m;

		n = enterIntFromConsole("n");
		m = enterIntFromConsole("m");

		int[][] array = new int[n][m];

		populateRandomArrayValues(array);

		sortArrayElemetnsRowUp(array);

		printArray(array);
		
		sortArrayElemetnsRowDown(array);

		printArray(array);

	}

	public static void sortArrayElemetnsRowUp(int[][] array) {
		int tmpValue = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length-1; j++) {
				for (int k = 0; k < array[i].length-1; k++) {

					if (array[i][k + 1] < array[i][k]) {

						tmpValue = array[i][k + 1];
						array[i][k + 1] = array[i][k];
						array[i][k] = tmpValue;
					}
				}

			}
		}
	}
	
	public static void sortArrayElemetnsRowDown(int[][] array) {
		int tmpValue = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length-1; j++) {
				for (int k = 0; k < array[i].length-1; k++) {

					if (array[i][k + 1] > array[i][k]) {

						tmpValue = array[i][k + 1];
						array[i][k + 1] = array[i][k];
						array[i][k] = tmpValue;
					}
				}

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
