package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("請輸入x的值：");
			int x = sc.nextInt();
			System.out.print("請輸入y的值：");
			int y = sc.nextInt();

			// 呼叫 Calculator 類別中的方法 
			int result = Calculator.powerXY(x, y);
			//正常列印
			System.out.println(x + " 的 " + y + " 次方等於 " + result);

		} catch (CalException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("輸入格式不正確");
		} finally {
			sc.close();
		}
	}

}
