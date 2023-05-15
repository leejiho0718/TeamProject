package assignment_6._2_Abstract_Shape;


// Triangle Ŭ���� - shape Ŭ���� ���
public class Triangle extends Shape {
	
	private double base;  	// �ﰢ���� �غ�
	private double height;	// �ﰢ���� ����
	
    // Triangle ������ - �غ�, ���� �ʱ�ȭ
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // getArea() - Shape Ŭ���� �������̵�
    public void getArea() {
        double area = 0.5 * base * height;  	// �ﰢ���� ���� ��� - 0.5 X �غ� 
        System.out.println("Triangle area: " + area);  
    }

}
