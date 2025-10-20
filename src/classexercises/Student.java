package classexercises;

public class Student {

	int score = 80;

	// 每休息一個小時，score就會減1
	public void play(int hours) {
		score -= hours;
	}

	// 每讀書一個小時，score就會加1
	public void study(int hours) {
		score += hours;
	}
	
	// 創建兩個student物件, 各別呼叫方法來模擬學生們的行為
	// 最後再顯示兩位學生分數資料觀察是否正確
	public static void main(String[] args) {
		Student lynn = new Student();
		Student jin = new Student();

		lynn.play(3);
		lynn.study(5);
		jin.play(2);
		jin.study(7);

		// 有static 所以不能直接寫score
		System.out.println(lynn.score);
		System.out.println(jin.score);

	}

}
