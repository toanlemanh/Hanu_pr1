package tut07;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Proposal of raising your wage ");
      //  double p = sc.nextDouble();

        Employee staff1 = new Employee("Kon",500.5);

        System.out.println("Employee :" + staff1.getName());
        System.out.println("Currently salary :" + staff1.getSalary());

        System.out.println("New salary :"+ staff1.raiseSalary(10));

    }
}
