package hw2;
//• 請設計一隻Java程式,輸出結果為以下:
//1 2 3 4 5 6 7 8 9 10
//1 2 3 4 5 6 7 8 9
//1 2 3 4 5 6 7 8
//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1

//請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
public class hw2_2 {
	public static void main(String[] args) {
		//阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
		//輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		for(int i=1 ; i<=49 ; i++) {
			if (i % 2== 0  ) {
				System.out.print(i + "+");
		}
	}
	

}
