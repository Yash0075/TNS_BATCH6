package day_2_Assignments;

import java.util.Scanner;

class Circle {
    double radius;
    String colour;
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        radius = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Enter Colour: ");
        colour = sc.nextLine();
    }

    
    void calcArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Colour: " + colour);
        System.out.println("Area: " + area);
    }
}

public class Assignment_3 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.getInput();
        c1.calcArea();
    }
}
