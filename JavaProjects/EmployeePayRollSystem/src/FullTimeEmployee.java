/**
 * Represents a full-time employee with a fixed monthly salary.
 * Extends the Employee base class.
 */
public class FullTimeEmployee extends Employee{
    /**
     * The fixed monthly salary for the full-time employee
     */
    private double monthlySalary;

    /**
     * Constructs a FullTimeEmployee with the specified name and monthly salary.
     * @param name The employee's name
     * @param monthlySalary The fixed monthly salary (must be non-negative)
     * @throws IllegalArgumentException if monthlySalary is negative
     */
    public FullTimeEmployee(String name,double monthlySalary){
        super(name);
        if(monthlySalary < 0){
            throw new IllegalArgumentException("monthlySalary cannot be less than 0");
        }
        this.monthlySalary= monthlySalary;
    }

    /**
     * Calculates the salary for a full-time employee.
     * For full-time employees, this is simply their monthly salary.
     * @return The monthly salary
     */
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
