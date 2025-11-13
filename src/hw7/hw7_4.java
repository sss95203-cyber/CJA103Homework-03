package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。
//注意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
//承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何
//(請利用多型簡化本題的程式設計)

public class hw7_4 {
	public static void main(String[] args) {
		try {
			File dir = new File("C:\\data");
			if (!dir.exists()) {
				dir.mkdir(); // 建立資料夾
			}

			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\data\\Object.ser"));

			// 產生物件
			Dog d1 = new Dog("Buddy");
			Dog d2 = new Dog("Lucky");
			Cat c1 = new Cat("Mimi");
			Cat c2 = new Cat("Neko");

			// 寫入檔案
			oos.writeObject(d1);
			oos.writeObject(d2);
			oos.writeObject(c1);
			oos.writeObject(c2);

			oos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}