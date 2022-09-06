package unit02.shape;

public abstract class Shape {
	private String name;
	protected static final double PI = 3.14;
	static protected int shapeCnt = 0;
	
	public Shape(){
		shapeCnt++;
	}
	public Shape(String name){
		this();
		this.name = name;
	}

	public void draw() {
		System.out.println("[" + name + "���� �׸���]");
	}
	
	public abstract void calculateArea();
	public abstract void calculateRound();
}
