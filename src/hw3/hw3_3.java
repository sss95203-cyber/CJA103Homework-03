package hw3;
//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數
//(提示:Scanner)
//(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)

import java.util.Scanner;

public class hw3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("阿文，請輸入你討厭哪個數字？");
		 int h = sc.nextInt();
		 
		 int count = 0; // 可選號碼數量統計

	        for (int i = 1; i <= 49; i++) {
	            // 如果數字中不含討厭的數字，就顯示
	    			// 如果個位數或十位數有4，就跳過
	    			if (i % 10 != h && i / 10 != h) {
	                System.out.print(i + " ");
	                count++;
	            }
	        }

	        System.out.println("總共有" + count + "數字可選");
	    }
	}
