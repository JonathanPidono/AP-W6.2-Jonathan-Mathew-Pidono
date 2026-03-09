public class Main {
    public static void main(String[] args) throws Exception {
        Employee[] employees = {
            new Manager("Alya", 5000000),
            new Programmer("Budi", 4000000),
            new Programmer("Citra", 4500000),
            new Intern("Dina", 2000000)
        };

        double totalPayroll = 0;

        for(int i = 0; i < employees.length; i++){
            employees[i].printInfo();
            totalPayroll += employees[i].calculateSalary();
        }
        
        System.out.printf("Total Payroll: %.1f%n", totalPayroll);
    }
}
