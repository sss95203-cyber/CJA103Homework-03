package Hero;

public abstract class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	
	public Hero() {  //無參數建構子
		this("David", 1, 0);
	}
	//    有參數建構子
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	public abstract void attack();
	
	public abstract void move();
	
	public abstract void defend();
}
