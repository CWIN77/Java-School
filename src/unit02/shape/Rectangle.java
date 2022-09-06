package unit02.shape;

public class Rectangle extends Shape {
	private int width;
	private int height;
	public Rectangle() {
		super();
	}
	public Rectangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	public void draw() {
		super.draw();
		System.out.println("���� " + width + ", ���� " + height + "�� �簢������ �׸��ϴ�.");
	}
	@Override
	public void calculateArea() {
		System.out.println("���� " + width + ", ���� " + height + "�� �簢���� ���̴� " + (width * height) + "�Դϴ�.");
	}

	@Override
	public void calculateRound() {
		System.out.println("���� " + width + ", ���� " + height + "�� �簢���� �ѷ��� " + (width + height)*2 + "�Դϴ�.");
	}
	
}
