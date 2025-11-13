package hw7;
//請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:

//Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class hw7_1 {
	public static void main(String[] args) {

		try {
			File file = new File("C:\\CJA103_Workspace\\CJA103Homework-03\\src\\hw7\\Sample.txt");
			long bytes = file.length();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			int chars = 0;
			int lines = 0;
			String line;

			while ((line = br.readLine()) != null) {
				lines++; // 每讀一行，行數+1
				chars += line.length(); // 每行的字元數加總
			}

			br.close();
			fr.close();

			System.out.println("Sample.txt檔案共有 " + bytes + " 個位元組, " + chars + " 個字元, " + lines + " 列資料");

		} 
		catch (IOException e) {}
	}
}