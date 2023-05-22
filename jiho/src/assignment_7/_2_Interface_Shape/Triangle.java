package assignment_7._2_Interface_Shape;


//Triangle 클래스 - Shape 인터페이스를 구현
public class Triangle implements Shape{
	
	private double base;		// 삼각형의 빝변
	private double height;		// 삼각형의 높이
	
	// Triangle 객체 생성자 - 밑변과 높이 초기화
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	// getArea() - Shape 인터페이스의 추상 메소드
	public void getArea() {
	    double area = 0.5 * base * height; 		// 삼각형 면적 계산 - 0.5 X 밑변 X 높이
	    System.out.println("Triangle area: " + area); // 계산 결과 출력
	}

}
