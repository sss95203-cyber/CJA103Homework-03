package hw4;

import java.util.Iterator;

//有個字串陣列如下 (八大行星):

//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示:字元比對,String方法)

public class hw4_3 {
	public static void main(String[] args) {
		String[] planets = {
	            "mercury", "venus", "earth", "mars",
	            "jupiter", "saturn", "uranus", "neptune"
	        };

	        int count = 0; // 計算母音總數
	        String vowels = "aeiou"; // 定義母音集合

	        // 外層迴圈：逐一取出每個行星名稱
	        for (int i = 0; i < planets.length; i++) {
	            String planet = planets[i];

	            // 內層迴圈：逐字檢查每個字母
	            for (int j = 0; j < planet.length(); j++) {
	                char c = planet.charAt(j);

	                // 檢查這個字母是否是母音
	                if (vowels.indexOf(c) != -1) {
	                    count++;
	                }
	            }
	        }

	        System.out.println("母音總數為：" + count);
	    }
	}