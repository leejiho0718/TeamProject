package assignment_6._2_Abstract_Shape;


// Triangle 클래스 - shape 클래스 상속
public class Triangle extends Shape {
	
	private double base;  	// 삼각형의 밑변
	private double height;	// 삼각형의 높이
	
    // Triangle 생성자 - 밑변, 높이 초기화
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // getArea() - Shape 클래스 오버라이드
    public void getArea() {
        double area = 0.5 * base * height;  	// 삼각형의 넓이 계산 - 0.5 X 밑변 
        System.out.println("Triangle area: " + area);  
    }

}
