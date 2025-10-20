package classexercises;

public class Test4Numbers {
	public static void main(String[] args) {
		//第一種方式
		for (int a = 0; a <= 100; a++) {
			if (a % 4 == 0) { // 單向選擇 如果符合這個條件
				// System.out.println(a); //我們才進行列印
				System.out.print(a + " ");
			}
		}
		System.out.println(); //換行
		System.out.print("\n"); //換行
		
		//第二種方式
		for(int i=0 ; i <= 100 ; i = i + 4) { //i+=4
			System.out.print(i + " ");
		}
	}
			
}
