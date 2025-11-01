package hw4;
//班上有8位同學,他們進行了6次考試結果如下:

//
//請算出每位同學考最高分的次數
//(提示:二維陣列)

public class hw4_6 {
	public static void main(String[] args) {
		int[][] scores = {
				{10,37,100,77,98,90},
				{35,75,70,95,70,80},
				{40,77,79,70,89,100},
				{100,89,90,89,90,75},
				{90,64,75,60,75,50},
				{85,75,70,75,90,20},
				{75,70,79,85,89,99},
				{70,95,90,89,90,75}
	};


    int[] top = new int[scores.length];

    for (int exam = 0; exam < scores[0].length; exam++) {
        int max = 0;
        for (int student = 0; student < scores.length; student++) {
            if (scores[student][exam] > max) {
                max = scores[student][exam];
            }
        }

        // 最高分
        for (int student = 0; student < scores.length; student++) {
            if (scores[student][exam] == max) {
                top[student]++;
            }
        }
    }

    for (int i = 0; i < top.length; i++) {
        System.out.println("學生 " + (i + 1) + " 最高分次數: " + top[i]);
    }
}

	}

