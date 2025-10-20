package hw1;

public class hw1_3 {
	public static void main(String[] args) {
		int totalsecs = 256559;
		int days = totalsecs / (24 * 3600);
		int hrs = (totalsecs % (24 * 3600)) / 3600;
		int mins = (totalsecs % 3600) / 60;
		int secs = totalsecs % 60;

		System.out.println("256559 秒為 " + days + " 天 " + hrs + " 小時 " + mins + " 分 " + secs + " 秒");

	}

}
