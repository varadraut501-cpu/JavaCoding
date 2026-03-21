package JavaCoding;

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Yearly Salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }
}

// Test Class
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul", "Patil", 20000);
        Employee e2 = new Employee("Sneha", "Shinde", 30000);

        // Before raise
        System.out.println("Yearly Salary:");
        System.out.println(e1.getFirstName() + " " + e1.getLastName() + " : " + e1.getYearlySalary());
        System.out.println(e2.getFirstName() + " " + e2.getLastName() + " : " + e2.getYearlySalary());

        // 10% raise
        e1.setMonthlySalary(e1.getMonthlySalary() * 1.10);
        e2.setMonthlySalary(e2.getMonthlySalary() * 1.10);

        // After raise
        System.out.println("\nAfter 10% Raise:");
        System.out.println(e1.getFirstName() + " " + e1.getLastName() + " : " + e1.getYearlySalary());
        System.out.println(e2.getFirstName() + " " + e2.getLastName() + " : " + e2.getYearlySalary());
    }
}