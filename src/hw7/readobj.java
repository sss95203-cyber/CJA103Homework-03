package hw7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class readobj {
	 public static void main(String[] args) {
	        try {
	            FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
	            ObjectInputStream ois = new ObjectInputStream(fis);

	            while (true) { // 不知道幾個物件就這樣寫
	                try {
	                    Object obj = ois.readObject();
	                    if (obj instanceof speak) {
	                        speak animal = (speak) obj;
	                        animal.speak();
	                    }
	                } catch (EOFException e) {
	                    break; // 讀到結尾就跳出
	                }
	            }

	            ois.close();
	            fis.close();

	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}