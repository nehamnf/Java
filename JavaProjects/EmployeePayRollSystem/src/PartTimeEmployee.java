/**
 * Represents a part-time employee paid based on hours worked and hourly rate.
 * Extends the Employee base class.
 */
public class PartTimeEmployee extends Employee{
    /**
     * Total hours worked by the part-time employee
     */
    private double hoursWorked;
    /**
     * Hourly rate for the part-time employee
     */
    private int hourlyRate;

    /**
     * Constructs a PartTimeExmployee with the specified name, hours worked, and hourly rate.
     * @param name The employee's name
     * @param hoursWorked Total hours worked (must be non-negative)
     * @param hourlyRate Hourly rate (must be non-negative)
     * @throws IllegalArgumentException if hoursWorked or hourlyRate is negative
     */
    public PartTimeEmployee(String name, double hoursWorked, int hourlyRate) {
        super(name);
        if (hoursWorked < 0 || hourlyRate < 0) {
            throw new IllegalArgumentException("Invalid inputs");
        }
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    /**
     * Calculates the salary for a part-time employee.
     * Salary is calculated as hours worked multiplied by hourly rate.
     * @return The calculated salary (hoursWorked * hourlyRate)
     */
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
