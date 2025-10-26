package classexercises;

//請分別建立x, y, z三個3x3的int陣列，然後把x和y陣列的加總存放到z陣列裡，
//再將結果顯示於螢幕上
//
//• x和y陣列中的數字：
//• 請用亂數產生介於0～30之間的整數
//• 亂數之取得可參考 java.lang.Math的靜態方法 random()
//• public static double random() 隨機產生
// ．傳回亂數值其範圍為0.0～1.0

public class array2 {
	public static void main(String[] args) {
		// 創建3x3二維陣列 V
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];

		// 將隨機亂數填入到x陣列
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				x[i][j] = (int) (Math.random() * 31 + 0); // 0～30
				y[i][j] = (int) (Math.random() * 31 + 0); // 0～30
				// 將x,y 對應位置的元素加總後 ,放到z陣列中

				z[i][j] = x[i][j] + y[i][j]; // 相加存入 z
			}
		}
		//利用迴圈印出每一個陣列
		System.out.println("x：");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("y：");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(y[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("z：");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(z[i][j] + " ");
			}
			System.out.println();
		}
		// System.out.println(Math.random()); //0.0< = r < 1.0
		// 隨機1~10之間數字 用以下方是
//		int r1 = (int) (Math.random() * 10) + 1;
//		System.out.println(r1); 
//		//0~30 
//		int r2 = (int) (Math.random() * 31) + 0; //*數字量+最小的那個數字
//		System.out.println(r2); 
//	}
	}
}
