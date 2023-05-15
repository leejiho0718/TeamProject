package assignment_6._2_Abstract_Shape;


// Rectangle Ŭ���� - shape Ŭ���� ���
public class Rectangle extends Shape {

    private double width;  		// �簢���� ��		(���� ����)
    private double height;		// �簢���� ����	(���� ����)

    // Rectangle ������ - ��, ���� �ʱ�ȭ
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // getArea() - Shape Ŭ���� �������̵�
    public void getArea() {
        double area = width * height;  					// �簢���� ���� - ���� X ����
        System.out.println("Rectangle area: " + area);  
    }
}
