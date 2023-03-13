package JavaGirisBTK12InheritanceManager;

public class InheritanceManager {
    public static void main(String[] args) {
        EmployeeManager employeeManager= new EmployeeManager();
        CustomerManager customerManager= new CustomerManager();
        employeeManager.BestEmployee();
        employeeManager.List();
        employeeManager.Add();
        customerManager.Add();
        customerManager.List();
    }
}
