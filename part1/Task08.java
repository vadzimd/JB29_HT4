package jb29.unit9.part1;

import java.util.Random;
import java.util.Scanner;

// 8. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

public class Task08 {

	public static void main(String[] args) {

		int n;

		n = enterIntFromConsole("N");

		int[] array = new int[n];

		populateRandomArrayValues(array);

		calculateSigns(array);
	}

	public static void calculateSigns(int[] array) {

		int counterMinus = 0;
		int counterZero = 0;
		int counterPlus = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				counterZero++;
			} else if (array[i] > 0) {
				counterPlus++;
			} else if (array[i] < 0) {
				counterMinus++;
			}

		}
		printResult("Number of positive values", counterPlus);
		printResult("Number of zero", counterZero);
		printResult("Number of negative values", counterMinus);

	}

	public static void populateRandomArrayValues(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);

			if (array[i] % 2 == 0) {
				array[i] = (-1) * array[i];
			}

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
