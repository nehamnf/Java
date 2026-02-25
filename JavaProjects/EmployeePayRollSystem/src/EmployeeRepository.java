import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Repository class for managing employee data storage and retrieval.
 * Provides CRUD operations for employees with thread-safe implementation.
 */
public class EmployeeRepository {
    /**
     * Thread-safe map to store employees by their ID
     */
    private final Map<Long,Employee> employeeStore = new ConcurrentHashMap<>();
    /**
     * Atomic counter for generating unique employee IDs
     */
    private final AtomicLong idGenerator = new AtomicLong(1);

    /**
     * Saves an employee to the repository.
     * If the employee doesn't have an ID, assigns a new unique ID.
     * @param employee The employee to save
     * @return The saved employee with assigned ID
     */
    public Employee save(Employee employee){
        if (employee.getEmpID() == null) {
            employee.assignId(idGenerator.getAndIncrement());
        }
        employeeStore.put(employee.getEmpID(), employee);
        return employee;
    }

    /**
     * Finds an employee by their ID.
     * @param id The employee ID to search for
     * @return The employee with the specified ID
     * @throws RuntimeException if employee is not found
     */
    public Employee findByID(Long id){
        Employee employee = employeeStore.get(id);
        if(employee == null){
            throw new RuntimeException("Employee does not exist");
        }
        return employee;
    }

    /**
     * Deletes an employee by their ID.
     * @param id The ID of the employee to delete
     * @throws RuntimeException if employee is not found
     */
    public void deleteById(Long id){
        Employee employee= employeeStore.get(id);
        if(employee == null){
            throw new RuntimeException("Employee doesn't exist");
        }
        employeeStore.remove(employee.getEmpID());
    }

    /**
     * Retrieves all employees from the repository.
     * @return A list containing all employees
     */
    public List<Employee> findAll(){
        return new ArrayList<>(employeeStore.values());
    }
}
