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
		System.out.println("�������� " + radius + "�� ���� �׸��ϴ�.");
	}
	@Override
	public void calculateArea() {
		System.out.println("�������� "+radius+"�� ���� ���̴� "+(PI*radius*radius));
	}

	@Override
	public void calculateRound() {
		System.out.println("�������� "+radius+"�� ���� �ѷ��� "+(2*PI*radius));
	}
	
}
