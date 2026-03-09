public class Intern extends Employee {

    Intern(String name, double baseSalary){
        super(name, baseSalary);
    }

    @Override
    double calculateSalary(){
        return baseSalary + 300000;
    }

    @Override
    String getRole(){
        return "Intern";
    }


}
