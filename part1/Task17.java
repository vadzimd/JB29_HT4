package jb29.unit9.part1;

import java.util.Random;
import java.util.Scanner;

// 17. Дана последовательность целых чисел n a ,a , ,a 1 2  . Образовать новую последовательность, выбросив из исходной те члены, которые равны min( , , , ) 1 2 n a a  a .

public class Task17 {

	public static void main(String[] args) {

		int n;

		n = enterIntFromConsole("N");

		int[] array = new int[n];

		populateRandomArrayValues(array);

		createModifiedArray(array);

	}

	public static void createModifiedArray(int[] array) {

		int numMin;
		int counter;
		int j = 0;

		numMin = findMin(array);

		counter = calcEqualMin(array, numMin);

		int[] arrayNew = new int[array.length - counter];

		for (int i = 0; i < array.length; i++) {

			if (array[i] != numMin) {
				
				arrayNew[j] = array[i];

				printResult("Modified arrayNew [" + j + "]", arrayNew[j]);
				
				j++;

			}

		}
	}

	public static int calcEqualMin(int[] array, int num) {

		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				counter++;
			}
		}
		return counter;

	}

	public static int findMin(int[] array) {

		int numMin = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < numMin) {
				numMin = array[i];
			}
		}
		return numMin;

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
