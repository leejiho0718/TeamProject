package assignment_6._2_Abstract_Shape;


// Circle 클래스 - shape 클래스 상속
public class Circle extends Shape {
	
    private double radius;  		// 원의 반지름

    // Circle 생성자 - 반지름 초기화
    public Circle(double radius) {
        this.radius = radius;
    }

    // getArea() - Shape 클래스 오버라이드
    public void getArea() {
        double area = 3.14 * radius * radius;  		// 원의 넓이 - pi X 반지름^2
        System.out.println("Circle area: " + area);  	
    }

}

