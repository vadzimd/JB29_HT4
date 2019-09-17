package jb29.unit9.part1;

import java.util.Random;
import java.util.Scanner;

// 11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).

public class Task11 {

	public static void main(String[] args) {

		int n;
		int m;
		int l;

		Random rand = new Random();

		n = enterIntFromConsole("N");
		m = enterIntFromConsole("M");

		int[] array = new int[n];

		populateRandomArrayValues(array);

		l = rand.nextInt(m - 1);

		findModL(array, m, l);

	}

	public static void findModL(int[] array, int m, int l) {

		printResult("L", l);

		for (int i = 0; i < array.length; i++) {
			if (array[i] % m == l) {
				printResult("Resulted array [" + i + "]", array[i]);
			}
		}

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
