package hw4;
//請設計由鍵盤輸入三個整數,

//分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//(提示1:Scanner,陣列)
//(提示2:需將閏年條件加入)
//(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
//

import java.util.Scanner;

public class hw4_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數 分別代表西元yyyy年,mm月,dd日：");
		int year = sc.nextInt(); // 可以用迴圈搭配索引值
		int month = sc.nextInt();
		int day = sc.nextInt();

		// 每個月分的天數
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 閏年
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			daysInMonth[1] = 29; // 2月份!!

		} else {
			
		}
		
		
		int Days = 0;
		for (int i = 0; i < month - 1; i++) {
			Days += daysInMonth[i];
		}
		Days += day;

		System.out.println("輸入的日期為該年第 " + Days + " 天");
		sc.close();

	}
}
