package jb29.unit9.part1;

import java.util.Random;
import java.util.Scanner;

// 16. Даны действительные числа 𝑎1, 𝑎2, … , 𝑎2𝑛. Найти max( , , , ) 1 2 2 2 −1 +1 + + + n n n n a a a a  a a .

public class Task16 {

	public static void main(String[] args) {

		int n;

		n = enterIntFromConsole("N");

		int[] array = new int[2 * n];

		populateRandomArrayValues(array);

		createModifiedArray(array);

	}

	public static void createModifiedArray(int[] array) {

		int n = array.length - 1;

		int[] arraySum = new int[array.length / 2];

		for (int i = 0; i < arraySum.length; i++) {
			arraySum[i] = array[i] + array[n];
			n -= 1;

			//printResult("Modified arraySum [" + i + "]", arraySum[i]);

		}

		findMax(arraySum);
	}

	public static void findMax(int[] array) {

		int numMax = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > numMax) {
				numMax = array[i];
			}
		}
		printResult("Maximum", numMax);

	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);

			printResult("Initial array [" + i + "]", array[i]);

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
