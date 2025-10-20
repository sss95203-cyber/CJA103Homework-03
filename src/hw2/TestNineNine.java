package hw2;

//輸出九九乘法表
public class TestNineNine {
	public static void main(String[] args) {
		// 一、for+while	
//		for (int i = 1; i <= 9; i++) {
//			int j = 1;
//			while (j <= 9) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t"); // \t tab鍵的功能
//				j++;
//		}
//			System.out.println();// 換行動作

			// 二、for+do while
//		for (int i = 1; i <= 9; i++) {
//			int j=1;
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			} while(j <= 9);
//			System.out.println();// 換行動作

			// 三、while+do while
		int i=1;
		while(i<=9) {
			int j=1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while(j<=9);
			i++;
			System.out.println();
		}
	}
}
