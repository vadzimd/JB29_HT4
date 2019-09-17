package jb29.unit9.part1;

import java.util.Random;
import java.util.Scanner;

// 9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Task09 {

	public static void main(String[] args) {

		int n;
		int maxPos;
		int minPos;
		int exchangeValue;

		n = enterIntFromConsole("N");

		int[] array = new int[n];

		populateRandomArrayValues(array);

		maxPos = findMax(array);
		minPos = findMin(array);

		exchangeValue = array[maxPos];
		array[maxPos] = array[minPos];
		array[minPos] = exchangeValue;

		for (int i = 0; i < array.length; i++) {

			printResult("Modified array [" + i + "]", array[i]);
		}

	}

	public static int findMax(int[] array) {

		int numMax = array[0];
		int maxPos = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > numMax) {
				numMax = array[i];
				maxPos = i;
			}
		}
		return maxPos;

	}

	public static int findMin(int[] array) {

		int numMin = array[0];
		int minPos = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < numMin) {
				numMin = array[i];
				minPos = i;
			}
		}
		return minPos;

	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);

			printResult("array [" + i + "]", array[i]);

		}
	}

	public static void printResult(String message, int value) {

		System.out.println(message + " is " + value);
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
