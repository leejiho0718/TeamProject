package assignment_6._2_Abstract_Shape;


// Rectangle 클래스 - shape 클래스 상속
public class Rectangle extends Shape {

    private double width;  		// 사각형의 폭		(가로 길이)
    private double height;		// 사각형의 높이	(세로 길이)

    // Rectangle 생성자 - 폭, 높이 초기화
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // getArea() - Shape 클래스 오버라이드
    public void getArea() {
        double area = width * height;  					// 사각형의 넓이 - 가로 X 세로
        System.out.println("Rectangle area: " + area);  
    }
}
