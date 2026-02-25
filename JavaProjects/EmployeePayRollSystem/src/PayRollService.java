import java.util.ArrayList;
import java.util.List;

/**
 * Service class for managing payroll operations.
 * Provides high-level business logic for employee management and payroll calculations.
 */
public class PayRollService {

    /**
     * Repository for data access operations
     */
    private EmployeeRepository employeeRepository;

    /**
     * Constructs a PayRollService with the specified repository.
     * @param employeeRepository The repository for employee data access
     */
    public PayRollService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    /**
     * Adds a new employee to the payroll system.
     * @param employee The employee to add
     * @return The saved employee with assigned ID
     */
    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    /**
     * Removes an employee from the payroll system by ID.
     * @param id The ID of the employee to remove
     */
    public void removeEmploye(Long id){
        employeeRepository.deleteById(id);
    }

    /**
     * Retrieves all employees in the payroll system.
     * @return A list of all employees
     */
    public List<Employee> listAllEmployees(){
        return  employeeRepository.findAll();
    }

    /**
     * Calculates the total payroll for all employees.
     * @return The sum of all employee salaries
     */
    public double totalPayroll(){
        double total=0.0;
        List<Employee> employeeList = listAllEmployees();
        for (Employee employee : employeeList) {
            total += employee.calculateSalary();
        }
        return total;
    }

}
