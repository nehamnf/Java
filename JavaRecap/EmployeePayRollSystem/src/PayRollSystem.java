import java.util.ArrayList;
import java.util.List;

public class PayRollSystem {
    private List<Employee> employeeList;

    public PayRollSystem(){
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        this.employeeList.add(employee);
    }

    public void removeEmployee(int empID){
        Employee employeeToRemove= null;
        for (Employee emp: employeeList){
            if(emp.getEmpID() == empID){
                employeeToRemove = emp;
                break;
            }
        }

        if(employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployee(){
        for(Employee e : employeeList){
            System.out.println(e);
        }
    }
}
