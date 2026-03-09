public class Programmer extends Employee {

    Programmer(String name, double baseSalary){
        super(name, baseSalary);
    }

    @Override
    double calculateSalary(){
        return baseSalary + 1000000;
    }

    @Override
    String getRole(){
        return "Programmer";
    }


}
