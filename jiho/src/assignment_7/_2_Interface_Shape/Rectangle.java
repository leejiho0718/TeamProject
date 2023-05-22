package assignment_7._2_Interface_Shape;

//Rectangle Ŭ���� - Shape �������̽��� ����
public class Rectangle implements Shape {
	
	private double width;			// �簢���� ��  (���� ����)
	private double height;			// �簢���� ���� (���� ����)

	//Rectangle ������ - ���ο� ���� ���� �ʱ�ȭ
	public Rectangle(double width, double height) {
		this.width = width;
	    this.height = height;
	}
	
	// getArea() - Shape �������̽��� �߻� �޼ҵ�
	public void getArea() {
	    double area = width * height; 		// �簢�� ���� ��� - ���� X ����
	    System.out.println("Rectangle area: " + area); 
	}


}
