package HomeWorkExt;

public class InkBrush extends Pen {

    public InkBrush(String brand, int price) {
        super(brand, price);
    }
//	(1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫

    @Override
    public void write() {
        System.out.println(getBrand() + " InkBrush：沾墨汁再寫");
    }

//  (2) Pencil實際售價為定價8折，InkBrush為定價9折

    @Override
    public double getPrice() {
        return super.getPrice() * 0.9;
    }
}