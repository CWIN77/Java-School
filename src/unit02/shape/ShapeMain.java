package unit02.shape;

public class ShapeMain {

	public static void main(String[] args) {
		System.out.println("������� ������ ���� : " + Circle.shapeCnt);
		System.out.println("===========================================");
		Circle c1 = new Circle("���׶��1",9);
		c1.draw();
		Rectangle r1 = new Rectangle("�׸�1",15,15);
		r1.draw();
		System.out.println("===========================================");
		System.out.println("������� ������ ���� : " + Circle.shapeCnt);
		System.out.println("===========================================");
		c1.calculateArea();
		c1.calculateRound();
		System.out.println("===========================================");
		r1.calculateArea();
		r1.calculateRound();
	}

}
