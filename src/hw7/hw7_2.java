package hw7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

//請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 

//(請使用append功能讓每次執行結果都能被保存起來)


public class hw7_2 {
	public static void main(String[] args) {
		try {
			FileOutputStream  fos = new FileOutputStream ("C:\\CJA103_Workspace\\CJA103Homework-03\\src\\hw7\\Data.txt", true);
			PrintStream  ps = new PrintStream (fos);
			Random rand = new Random();
			
			for(int i = 0 ; i <10 ; i++) {
				int nums = rand.nextInt(1000)+1;
				ps.print(nums + " ");
			}
			 ps.println();
			  ps.close();
	          fos.close();
		}
		catch (IOException e) {
			
		}
	}
}
