package HomeWorkExt;
//• 建立父類別Pen
//• (1) 兩個屬性：品牌(brand)、價格(price) (封裝設計) 
//• (2) 建構子設計：一個無參數與一個根據屬性而設計 
//• (3) 定義Getter/Setter方法
//• (4) 宣告一個抽象方法write()
//• 建立兩個子類別Pencil與InkBrush繼承Pen父類別


public abstract class Pen {
//	(1) 兩個屬性：品牌(brand)、價格(price) (封裝設計) 
	private String brand;
	private double price;
	
//	(2) 一個無參數建構子設計
    public Pen() {
    }
//    (2)一個根據屬性String 
    public Pen(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    
//    (3) 定義Getter/Setter方法
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
//    (4) 宣告一個抽象方法write()
    
    public void write() {
	}
}



