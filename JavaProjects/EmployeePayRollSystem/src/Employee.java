import java.util.Objects;

/**
 * Abstract base class representing an employee in the payroll system.
 * Provides common attributes and behaviors for all employee types.
 */
public abstract class Employee {
    /**
     * The employee's name
     */
    private String name;
    /**
     * Unique identifier for the employee
     */
    private Long empID;

    /**
     * Constructs an Employee with the specified name.
     * @param name The employee's name (cannot be null or blank)
     * @throws IllegalArgumentException if name is null or blank
     */
    public Employee(String name){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Name can not be Empty");
        }
        this.name= name;
    }

    /**
     * Assigns a unique ID to the employee.
     * @param empID The unique employee ID
     * @throws IllegalArgumentException if employee already has an ID
     */
    public void assignId(long empID){
        if(this.empID != null){
            throw new IllegalArgumentException("Employee already has an ID");
        }
        this.empID = empID;
    }

    /**
     * Returns the employee's name.
     * @return The employee's name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Returns the employee's unique ID.
     * @return The employee's ID, or null if not assigned
     */
    public Long getEmpID(){
        return empID;
    }

    /**
     * Calculates the employee's salary.
     * Must be implemented by concrete employee subclasses.
     * @return The calculated salary amount
     */
    public abstract double calculateSalary();

    /**
     * Compares this employee to another object for equality.
     * Two employees are considered equal if they have the same ID.
     * @param o The object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
//        return Objects.equals(employee.empID, empID);
        return  this.empID.equals(employee.empID); //both are correct
    }

    /**
     * Returns a hash code value for the employee based on ID.
     * @return Hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.empID);
    }

    /**
     * Returns a string representation of the employee.
     * Includes name, ID, and calculated salary.
     * @return String representation of the employee
     */
    @Override
    public String toString() {
        return getClass().getSimpleName()+" {" +
                "name='" + name + '\'' +
                ", empID=" + empID +
                ", Salary="+calculateSalary()+
                '}';
    }
}
