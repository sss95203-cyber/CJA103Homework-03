package HomeWorkExt;

public class TestPen {
	public static void main(String[] args) {
//      • (3) 多型操作，當共同呼叫write()方法與getPrice()方法
//    	各種筆都可正確顯示write內容與售價金額

		Pen[] pens = new Pen[2];
		pens[0] = new Pencil("無印良品", 15);
		pens[1] = new InkBrush("中華筆莊", 50);

		for (int i = 0; i < pens.length; i++) {
			pens[i].write();
			System.out.println("售價：" + pens[i].getPrice() + " 元");

		}
	}
}