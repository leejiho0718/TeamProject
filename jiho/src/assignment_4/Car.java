package assignment_4;

import java.util.Scanner;

public class Car {
    private int year;
    private String maker;
    private double speed;

    public Car(int year, String maker, double speed) {
        this.year = year;
        this.maker = maker;
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return maker;
    }

    public double getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("���� �Է�: ");
        int year = scanner.nextInt();

        System.out.print("�� ����: ");
        String maker = scanner.next();

        System.out.print("�ӵ�: ");
        double speed = scanner.nextDouble();

        Car car = new Car(year, maker, speed);

        System.out.println("Year: " + car.getYear());
        System.out.println("Make: " + car.getMake());
        System.out.println("Max speed: " + car.getSpeed() + " km/h");
    }
}
