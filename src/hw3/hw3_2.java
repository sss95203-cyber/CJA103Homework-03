package hw3;
//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息
//(提示:Scanner,亂數方法,無窮迴圈)
//(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
//for (int i = 0; i < 3; i++) {
//	for (int j = 0; j < 3; j++) {
//		x[i][j] = (int) (Math.random() * 31 + 0); // 0～30
//		y[i][j] = (int) (Math.random() * 31 + 0); // 0～30

import java.util.Scanner;

public class hw3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("開始猜數字吧！");
		
		int a = (int) (Math.random() * 10); 

		
		while(true) {
			int x = sc.nextInt();  //要把輸入放到迴圈裡
		
			if(x == a) {
				System.out.println("答對了！答案就是" + a);
				break;
			}
			else {
				System.out.println("猜錯囉");
				
			}		
		}
	}

}
