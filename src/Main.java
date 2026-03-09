public class Main {
    public static void main(String[] args) throws Exception {
        Employee[] employees = {
            new Manager("Alya", 5000000),
            new Programmer("Budi", 4000000),
            new Programmer("Citra", 4500000),
            new Intern("Dina", 2000000)
        };

        double totalPayroll = 0;

        for (int i = 0; i < employees.length; i++) {
            employees[i].printInfo();
            totalPayroll += employees[i].calculateSalary();
        }

        System.out.printf("Total Payroll: %.1f%n", totalPayroll);
    }
}

class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary;
    }

    String getRole() {
        return "Employee";
    }

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + getRole());
        System.out.println("Salary: " + calculateSalary());
        System.err.println();
    }
}

class Manager extends Employee {

    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary + 2000000;
    }

    @Override
    String getRole() {
        return "Manager";
    }
}

class Programmer extends Employee {

    Programmer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary + 1000000;
    }

    @Override
    String getRole() {
        return "Programmer";
    }
}

class Intern extends Employee {

    Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary + 300000;
    }

    @Override
    String getRole() {
        return "Intern";
    }
}