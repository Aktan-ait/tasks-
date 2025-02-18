interface Payable {
    double getPaymentAmount();
}

abstract class Employee implements Payable {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary(); 

    void displayEmployeeInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Base Salary: " + (this instanceof FullTimeEmployee ? ((FullTimeEmployee) this).baseSalary : 0));
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double baseSalary;

    FullTimeEmployee(String name, int id, double baseSalary) {
        super(name, id);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() { 
        return baseSalary * 1.2;
    }

    @Override
    public double getPaymentAmount() {
        return calculateSalary();
    }
}

class ContractEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() { 
        return hourlyRate * hoursWorked;
    }

    @Override
    public double getPaymentAmount() {
        return calculateSalary();
    }
}

public class EmpManagement {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Aktan Keneshov", 101, 5000);
        Employee emp2 = new ContractEmployee("Zhumabek Kalybaev", 102, 50, 80);

        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
    }
}
