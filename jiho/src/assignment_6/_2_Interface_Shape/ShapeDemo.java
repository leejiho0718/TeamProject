package assignment_6._2_Interface_Shape;

public class ShapeDemo {
	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[3]; 		// Shape �������̽� ���� -> ��ü �迭 ����
		shapes[0] = new Triangle(3, 4); 	// �迭�� ù ��° �ε��� - Triangle ��ü �Ҵ�
		shapes[1] = new Rectangle(4, 4); 	// �迭�� �� ��° �ε��� - Rectangle ��ü �Ҵ�
		shapes[2] = new Circle(5); 			// �迭�� �� ��° �ε��� - Circle ��ü �Ҵ�
		
		
		// 0���� shape.length( = 3 )���� 1�� �����ϸ� �ݺ�
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].getArea();			// shape[1].getArea() = Triangle ����
											// shape[2].getArea() = Rectangle ����
											// shape[3].getArea() = Circle ����
		}
	}
}