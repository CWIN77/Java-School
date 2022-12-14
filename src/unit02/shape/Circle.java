package unit02.shape;

public class Circle extends Shape {
	private int radius;
	public Circle() {
		super();
	}
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	public void draw() {
		super.draw();
		System.out.println("반지름이 " + radius + "인 원을 그립니다.");
	}
	@Override
	public void calculateArea() {
		System.out.println("반지름이 "+radius+"인 원의 넓이는 "+(PI*radius*radius));
	}

	@Override
	public void calculateRound() {
		System.out.println("반지름이 "+radius+"인 원의 둘레는 "+(2*PI*radius));
	}
	
}
