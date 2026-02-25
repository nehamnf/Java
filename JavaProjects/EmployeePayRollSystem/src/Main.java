/**
 * Main class to demonstrate the Employee Payroll System.
 * Creates employees, adds them to the system, and displays the results.
 */
public class Main {
    /**
     * Main method - entry point of the application.
     * Demonstrates creating employees and managing payroll.
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create repository and payroll service
        EmployeeRepository employeeRepository = new EmployeeRepository();
        PayRollService payRollSystem= new PayRollService(employeeRepository);
        
        // Create employees
        FullTimeEmployee fullTimeEmployee= new FullTimeEmployee("neha",10000.0);
        PartTimeEmployee partTimeExmployee= new PartTimeEmployee("mn",30,10000);
        
        // Add employees to the payroll system
        payRollSystem.addEmployee(fullTimeEmployee);
        payRollSystem.addEmployee(partTimeExmployee);
        
        // Display all employees
        System.out.println(payRollSystem.listAllEmployees());

    }
}
