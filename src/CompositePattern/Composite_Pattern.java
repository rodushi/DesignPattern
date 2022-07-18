
package CompositePattern;

import java.util.ArrayList;
import java.util.List;

interface Employee{
    public void showEmployeeDetails();
}
class developer implements Employee{
private String name;

private String employee_id;
public developer (String name,String emp_id){
    this.employee_id=emp_id;
    this.name=name;
}
    @Override
    public void showEmployeeDetails() {
        System.out.println("Name: "+this.name+" , Emp_id: "+this.employee_id);
    }
    
}

class manager implements Employee{
private String name;

private String employee_id;
public manager (String name,String emp_id){
    this.employee_id=emp_id;
    this.name=name;
}
    @Override
    public void showEmployeeDetails() {
        System.out.println("Name: "+this.name+" , Emp_id: "+this.employee_id);
    }
    
}
class companyDirectory implements Employee{
private List<Employee> employeeList = new ArrayList<Employee>();
    @Override
    public void showEmployeeDetails() {
        for (Employee emp : employeeList)
        {
            emp.showEmployeeDetails();
        }
    }
    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }
    public void removeEmplyee(Employee emp){
        employeeList.remove(emp);
    }
}
public class Composite_Pattern {
    public static void main(String[] args) {
        developer dev1 = new developer("A","1001");
        developer dev2 = new developer("B","1002");
        companyDirectory engD = new companyDirectory();
        engD.addEmployee(dev1);
        engD.addEmployee(dev2);
        engD.showEmployeeDetails();
        
        manager man1 = new manager("C","1003");
        manager man2 = new manager("D","1004");
        companyDirectory manD = new companyDirectory();
        manD.addEmployee(man1);
        manD.addEmployee(man2);
        manD.showEmployeeDetails();
        
        
    }
}
  