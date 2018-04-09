import Employee.EmployeeComponent;

public class FilterHelper {

    private EmployeeComponent employeeComponent;

    public FilterHelper(EmployeeComponent employeeComponent) {
        this.employeeComponent = employeeComponent;
    }

    public void allEmployeePrinting(){
        employeeComponent.print();
    }


}
