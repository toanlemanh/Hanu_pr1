package tut07;

public class Employee {
        private String name;
        private double Salary;

        public Employee(String x, double y){
            name = x; // assign name for value x
            Salary = y;
        }
        public String getName(){
            return name;
        }
        public double getSalary(){
            return Salary;
        }
        public double raiseSalary (double s){
            Salary = Salary + Salary*s/100;
            return Salary;
        }


}
