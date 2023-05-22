package assignment_7._2_Interface_Shape;

//Rectangle 클래스 - Shape 인터페이스를 구현
public class Rectangle implements Shape {
	
	private double width;			// 사각형의 폭  (가로 길이)
	private double height;			// 사각형의 높이 (세로 길이)

	//Rectangle 생성자 - 가로와 세로 길이 초기화
	public Rectangle(double width, double height) {
		this.width = width;
	    this.height = height;
	}
	
	// getArea() - Shape 인터페이스의 추상 메소드
	public void getArea() {
	    double area = width * height; 		// 사각형 면적 계산 - 가로 X 세로
	    System.out.println("Rectangle area: " + area); 
	}


}
