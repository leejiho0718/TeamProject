package assignment_7._2_Interface_Shape;


//Triangle Ŭ���� - Shape �������̽��� ����
public class Triangle implements Shape{
	
	private double base;		// �ﰢ���� ����
	private double height;		// �ﰢ���� ����
	
	// Triangle ��ü ������ - �غ��� ���� �ʱ�ȭ
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	// getArea() - Shape �������̽��� �߻� �޼ҵ�
	public void getArea() {
	    double area = 0.5 * base * height; 		// �ﰢ�� ���� ��� - 0.5 X �غ� X ����
	    System.out.println("Triangle area: " + area); // ��� ��� ���
	}

}
