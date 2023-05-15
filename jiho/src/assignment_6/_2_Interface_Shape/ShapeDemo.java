package assignment_6._2_Interface_Shape;

public class ShapeDemo {
	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[3]; 		// Shape 인터페이스 구현 -> 객체 배열 생성
		shapes[0] = new Triangle(3, 4); 	// 배열의 첫 번째 인덱스 - Triangle 객체 할당
		shapes[1] = new Rectangle(4, 4); 	// 배열의 두 번째 인덱스 - Rectangle 객체 할당
		shapes[2] = new Circle(5); 			// 배열의 세 번째 인덱스 - Circle 객체 할당
		
		
		// 0부터 shape.length( = 3 )까지 1씩 증가하며 반복
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].getArea();			// shape[1].getArea() = Triangle 넓이
											// shape[2].getArea() = Rectangle 넓이
											// shape[3].getArea() = Circle 넓이
		}
	}
}