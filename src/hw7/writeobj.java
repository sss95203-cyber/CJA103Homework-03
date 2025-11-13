package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class writeobj {
	 public static void main(String[] args) {
	        try {
	            // 1️⃣ 檢查資料夾是否存在
	            File dir = new File("C:\\data");
	            if (!dir.exists()) {
	                dir.mkdirs(); // 建立資料夾
	                System.out.println("資料夾不存在，已建立 C:\\data");
	            }

	            // 2️⃣ 建立物件
	            speak[] animals = {
	                new Dog("Buddy"),
	                new Dog("Max"),
	                new Cat("Luna"),
	                new Cat("Milo")
	            };

	            // 3️⃣ 寫入序列化檔案
	            FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);

	            for (speak animal : animals) {
	                oos.writeObject(animal);
	            }

	            oos.close();
	            fos.close();

	            System.out.println("物件已成功寫入 C:\\data\\Object.ser");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

