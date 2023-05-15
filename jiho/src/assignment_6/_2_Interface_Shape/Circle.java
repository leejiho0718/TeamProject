package assignment_6._2_Interface_Shape;


//Circle 클래스 - Shape 인터페이스를 구현
public class Circle implements Shape {
	
	 private double radius;		// 원의 반지름

	 // Circle 생성자 - 반지름 초기화
	 public Circle(double radius) {
	     this.radius = radius;
	 }

	 // getArea() - Shape 인터페이스의 추상 메소드 
	 public void getArea() {
	     double area = 3.14 * radius * radius; 		// 원 면적 -> pi X 반지름^2
	     System.out.println("Circle area: " + area); 	
	 }

}
