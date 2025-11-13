package hw5;

import java.util.Scanner;

//請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如

public class hw5_1 {

	public static void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("請輸入長方形的寬：");
		int width = sc.nextInt();

		System.out.print("請輸入長方形的高：");
		int height = sc.nextInt();

		System.out.println("印出結果：");
		starSquare(width, height);

		sc.close();
	}

}
