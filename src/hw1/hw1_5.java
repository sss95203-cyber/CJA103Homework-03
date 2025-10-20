package hw1;

public class hw1_5 {
	public static void main(String[] args) {
		double money = 1500000;
		double rate = 0.02;
		int years = 10;
		double FV=money*Math.pow((1+rate),years);
		// FV ＝ PV×（1 ＋ R）n 次方 =1500000(1+0.02)^10
		// Math.pow(___.幾次方)
		// FV 為期末本利和，PV 為期初本金，R 為每期利率，
		// n 為期數也就是--期末本利和＝期初本金×（1＋利率）期數次方。
		System.out.println("本金150萬，利率2%，10年後本金加利息共有 " + FV);
	}

}
