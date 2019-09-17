package jb29.unit9.part1;


import java.util.Scanner;

//13. Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в промежутке от L до N.

public class Task13 {

	public static void main(String[] args) {

		int l;
		int n;
		int m;

		l = enterIntFromConsole("L");
		n = enterIntFromConsole("N (> L)");
		m = enterIntFromConsole("M");

		int[] array = new int[n - l + 1];

		populateArrayValues(array, l);

		findModM(array, m);

	}

	public static void findModM(int[] array, int m) {
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % m == 0) {
				counter++;
			}
		}
		printResult("The number", counter);

	}

	public static void populateArrayValues(int[] array, int l) {

		for (int i = 0; i < array.length; i++) {
			array[i] = l;
			l++;

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
