package assignment_4._2_1_Car;

import java.util.Scanner;

public class Car {
    private int year;			// private ���� - class �ܺο��� ���� �Ұ�
    private String maker;
    private double speed;
    
    // Car Ŭ������ ������ �޼��� - year, maker, speed �ŰԺ��� ���
    public Car(int year, String maker, double speed) {
        this.year = year;		// this.������� - �Ű� ������ ��ü �ڽ��� ������ �ִ� ������ �̸��� ���� ��� 
        this.maker = maker; 	//				�̸��� �����ϱ� ���� this. �� ����
        this.speed = speed;
    }

    // getYear() �޼��� - �ڵ����� ���������� ��ȯ
    public int getYear() {
        return year;
    }

    // getMake() �޼��� - �ڵ����� ������ ��ȯ
    public String getMake() {
        return maker;
    }

    // getSpeed() �޼��� - �ڵ����� �ӵ��� ��ȯ
    public double getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("���� �Է�: ");
        int year = input.nextInt();

        System.out.print("�� ����: ");
        String maker = input.next();

        System.out.print("�ӵ�: ");
        double speed = input.nextDouble();

        // Car Ŭ������ �� �ν��Ͻ� - year, maker, speed ���� ���� �����ڸ� ����Ͽ� ����
        Car car = new Car(year, maker, speed);	

        System.out.println("Year: " + car.getYear());					// car ��ü���� getYear() �޼��� ȣ��
        System.out.println("Make: " + car.getMake());					// car ��ü���� getMake() �޼��� ȣ��
        System.out.println("speed: " + car.getSpeed() + " km/h");	// car ��ü���� getSpeed() �޼��� ȣ��
        
        input.close();
    }
}
