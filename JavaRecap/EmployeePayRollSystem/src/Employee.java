public abstract class Employee {
    private String name;
    private int empID;

    public Employee(String name,int id){
        this.name= name;
        this.empID= id;
    }

    public String getName(){
        return this.name;
    }

    public int getEmpID(){
        return empID;
    }

    public abstract double getSalary();

    @Override
    public String toString() {
        return getClass()+" {" +
                "name='" + name + '\'' +
                ", empID=" + empID +
                ", Salary="+getSalary()+
                '}';
    }
}
