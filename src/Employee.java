public class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary(){
        return baseSalary;
    }

    String getRole(){
        return "Employee";
    }


    void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Role: " + getRole());
        System.out.println("Salary: " + calculateSalary());
        System.out.println();
    }
}

