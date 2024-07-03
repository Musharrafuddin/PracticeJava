import java.util.*;

public class ArrayList_1 {
    public static void main(String args[]){
        List <Employee> employeeList =new ArrayList<Employee>();
        Employee e= new Employee(100,"Mushu",25000);
        employeeList.add(e);
        employeeList.add(new Employee(110,"rajesh",3400));
        System.out.println(e.employeeId);
        Employee e1=new Employee();
        e1.setemployeeId(111);
        e1.setSalary(3456);
        e1.setemployeeName("uday");

        employeeList.add(e1);
        System.out.println(employeeList);

        for(Employee em:employeeList){
            System.out.println(em);
        }
        System.out.println(e1.getemployeeId());
        System.out.println(e1.getsalary());
        System.out.println(e1.getemployeeName());

    }
}
