package assignment_4._2_1_Car;

import java.util.Scanner;

public class Car {
    private int year;			// private 변수 - class 외부에서 접근 불가
    private String maker;
    private double speed;
    
    // Car 클래스의 생성자 메서드 - year, maker, speed 매게변수 사용
    public Car(int year, String maker, double speed) {
        this.year = year;		// this.멤버변수 - 매개 변수와 객체 자신이 가지고 있는 변수의 이름이 같은 경우 
        this.maker = maker; 	//				이름을 구분하기 위해 this. 을 붙임
        this.speed = speed;
    }

    // getYear() 메서드 - 자동차의 제조연도를 반환
    public int getYear() {
        return year;
    }

    // getMake() 메서드 - 자동차의 종류를 반환
    public String getMake() {
        return maker;
    }

    // getSpeed() 메서드 - 자동차의 속도를 반환
    public double getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("연도 입력: ");
        int year = input.nextInt();

        System.out.print("차 종류: ");
        String maker = input.next();

        System.out.print("속도: ");
        double speed = input.nextDouble();

        // Car 클래스의 새 인스턴스 - year, maker, speed 값을 가진 생성자를 사용하여 생성
        Car car = new Car(year, maker, speed);	

        System.out.println("Year: " + car.getYear());					// car 객체에서 getYear() 메서드 호출
        System.out.println("Make: " + car.getMake());					// car 객체에서 getMake() 메서드 호출
        System.out.println("speed: " + car.getSpeed() + " km/h");	// car 객체에서 getSpeed() 메서드 호출
        
        input.close();
    }
}
