package assignment_6._2_Abstract_Shape;


// Circle Ŭ���� - shape Ŭ���� ���
public class Circle extends Shape {
	
    private double radius;  		// ���� ������

    // Circle ������ - ������ �ʱ�ȭ
    public Circle(double radius) {
        this.radius = radius;
    }

    // getArea() - Shape Ŭ���� �������̵�
    public void getArea() {
        double area = 3.14 * radius * radius;  		// ���� ���� - pi X ������^2
        System.out.println("Circle area: " + area);  	
    }

}

