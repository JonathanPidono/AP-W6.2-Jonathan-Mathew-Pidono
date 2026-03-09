public class Manager extends Employee {

    Manager(String name, double baseSalary){
        super(name, baseSalary);
    }

    @Override
    double calculateSalary(){
        return baseSalary + 2000000;
    }

    @Override
    String getRole(){
        return "Manager";
    }


}
