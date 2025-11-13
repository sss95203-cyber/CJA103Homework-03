package hw5;
//請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中

//取平均值並印出這10個亂數與平均值,如圖:

import java.util.Scanner;

public class hw5_2 {

	public static void randAvg() {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		int sum = 0;
		System.out.println("本次亂數結果 :");

		for (int i = 0; i < nums.length; i++) {
			int a = (int) (Math.random() * 100);
			nums[i] = a;
			System.out.print(nums[i] + " ");
			sum += nums[i];
		}
		double avg = sum / 10.0;
		System.out.println();
		System.out.println(avg);

	}

	public static void main(String[] args) {
		randAvg(); 
	}
}
