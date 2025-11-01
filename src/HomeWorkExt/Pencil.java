package HomeWorkExt;

//implements 關鍵字是用來讓一個類別實現一個或多個介面 (interface)
//繼承用

public class Pencil extends Pen {
	public Pencil(String brand, int price) {
        super(brand, price);
    }
//	(1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫

	@Override
    public void write() {
        System.out.println(getBrand() + " Pencil：削鉛筆再寫");
    }
	
//  (2) Pencil實際售價為定價8折，InkBrush為定價9折
    @Override
    public double getPrice() {
        return super.getPrice() * 0.8;
    }
}
	


