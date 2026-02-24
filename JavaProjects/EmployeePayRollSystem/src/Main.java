public class Main {
    public static void main(String[] args) {
        PayRollSystem payRollSystem= new PayRollSystem();
        FullTimeEmployee fullTimeEmployee= new FullTimeEmployee("neha",1,10000.0);
        PartTimeExmployee  partTimeExmployee= new PartTimeExmployee("mn",2,30,10000);
        payRollSystem.addEmployee(fullTimeEmployee);
        payRollSystem.addEmployee(partTimeExmployee);
        payRollSystem.displayEmployee();
        payRollSystem.removeEmployee(partTimeExmployee.getEmpID());
        payRollSystem.displayEmployee();
    }
}
