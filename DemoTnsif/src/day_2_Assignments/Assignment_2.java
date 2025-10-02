package day_2_Assignments;
import java.util.Scanner;

class Student {
    Student() {
        System.out.println("Student object is created");
    }
}

class Commission {
    String name, address;
    String phone;
    double sales_amount;

 
    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Phone: ");
        phone = sc.nextLine();
        System.out.print("Enter Sales Amount: ");
        sales_amount = sc.nextDouble();
    }

    
    void calculateCommission() {
        double commission = 0;
        if (sales_amount >= 100000) {
            commission = sales_amount * 0.10;
        } else if (sales_amount >= 50000) {
            commission = sales_amount * 0.05;
        } else if (sales_amount >= 30000) {
            commission = sales_amount * 0.03;
        } else {
            commission = 0;
        }
        System.out.println("Sales Amount: " + sales_amount);
        System.out.println("Commission: " + commission);
    }
}


public class Assignment_2 {
    public static void main(String[] args) {
       
        Student s1 = new Student();
        Commission c1 = new Commission();
        c1.acceptDetails();
        c1.calculateCommission();
    }
}