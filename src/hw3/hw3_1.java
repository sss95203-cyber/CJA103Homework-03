package hw3;

import java.util.Scanner;

//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形,如圖示結果:
//
//(提示:Scanner,三角形成立條件,判斷式if else)
//(進階功能:加入直角三角形的判斷)
public class hw3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數：");
		int data1 = sc.nextInt(); // 可以用迴圈搭配索引值
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();
//		System.out.println(data1 + data2+ data3);

		if (data1 + data2 > data3 && data1 + data3 > data2 && data2 + data3 > data1) {
			if (data1 == data2 && data3 == data1) {
				System.out.println("正三角形");
			} else if (data1 == data2 || data1 == data3 || data2 == data3) {
				System.out.println("等腰三角形");
			} else if (data1 * data1 + data2 * data2 == data3 * data3 || data1 * data1 + data3 * data3 == data2 * data2
					|| data2 * data2 + data3 * data3 == data1 * data1) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其它三角形");
			}
		} else {
			// 不符合三角形條件
			System.out.println("不是三角形");
		}
	}
}