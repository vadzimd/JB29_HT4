package jb29.unit9.part2;

import java.util.Scanner;

// 40. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1,
//2, 3, ..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны
// между собой. Построить такой квадрат. Пример магического квадрата порядка 3:

public class Task40 {

	public static void main(String[] args) {

		int n;

		n = enterIntFromConsole("n");

		int[][] array = new int[n][n];

		createMagicArray(array, n);
	}

	public static void createMagicArray(int[][] array, int n) {
		int row = n - 1;
		int col = n / 2;
		array[row][col] = 1;

		for (int i = 2; i <= n * n; i++) {
			if (array[(row + 1) % n][(col + 1) % n] == 0) {
				row = (row + 1) % n;
				col = (col + 1) % n;
			} else {
				row = (row - 1 + n) % n;
			}
			array[row][col] = i;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i][j] < 10)
					System.out.print(" ");
				if (array[i][j] < 100)
					System.out.print(" ");
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

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
