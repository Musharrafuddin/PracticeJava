public class Employee {
    Integer employeeId;
    String employeeName;
    Integer salary;
    public Employee(Integer employeeId, String employeeName, Integer salary){
        super();
        this.employeeId= employeeId;
        this.employeeName=employeeName;
        this.salary= salary;
    }


    public Employee() {
        super();
    }
    public Integer getemployeeId(){
        return employeeId;
    }
    public Integer getsalary(){
        return salary;
    }
    public String getemployeeName(){
        return employeeName;
    }

    public void setemployeeId(int employeeId) {
        this.employeeId=employeeId;
    }
    public void setSalary(int salary) {
     this.salary=salary;
    }

    public void setemployeeName(String employeeName) {
        this.employeeName=employeeName;
    }
}

