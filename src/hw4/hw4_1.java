package hw4;
//有個一維陣列如下:

//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示:陣列,length屬性)

public class hw4_1 {
	public static void main(String[] args) {
		int[] nums = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		double avg = (double) sum / nums.length;
		System.out.println("平均值 = " + avg);

		System.out.println("大於平均值的元素 ： ");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > avg) {
				System.out.print(nums[i] + " ");
			}

		}

	}
}
