public class PartTimeExmployee extends Employee{
    private double hoursWorked;
    private int hourlyRate;

    public PartTimeExmployee(String name, int id, double hoursWorked, int hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        return hourlyRate * hoursWorked;
    }
}
