package hw5;


//要幫系統的註冊新增驗證碼的功能,請設計一個方法
//genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼
//此驗證碼內容包含了英文大小寫與數字的亂數組合,如圖:
	
	
public class hw5_5 {
	public static String genAuthCode() {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder code = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int index = (int)(Math.random() * chars.length()); // 隨機位置
            code.append(chars.charAt(index)); // 加進字串中
        }


        return code.toString();
    }

    public static void main(String[] args) {
        // 測試多次看看
        System.out.println("本次隨機產生驗證碼為：" + genAuthCode());
    }
}