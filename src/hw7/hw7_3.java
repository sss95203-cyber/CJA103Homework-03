package hw7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。
//呼叫此方法時,第一個參數所代表的檔案會複製到第二個參數代表的檔案

public class hw7_3 {
public static void copyFile(String File1, String File2) {
	try {
		FileInputStream fis = new FileInputStream(File1);
		FileOutputStream  fos = new FileOutputStream (File2);
		
		byte[] buffer = new byte[1024];
        int length;

        while ((length = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, length);
        }

        fis.close();
        fos.close();

    } catch (IOException e) {    }
}

public static void main(String[] args) {
    String a1 = "C:\\CJA103_Workspace\\CJA103Homework-03\\src\\hw7\\Data.txt";
    String a2 = "C:\\CJA103_Workspace\\CJA103Homework-03\\src\\hw7\\CopyData.txt";

    copyFile(a1, a2);
}
}