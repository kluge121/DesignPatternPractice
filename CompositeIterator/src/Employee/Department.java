package Employee;

import Enum.DepartmentEnum;

import java.util.ArrayList;
import java.util.Iterator;

public class Department extends EmployeeComponent {


    private Enum.DepartmentEnum departmentEnum;
    private Iterator<EmployeeComponent> iterator;
    private ArrayList<EmployeeComponent> employeeComponents = new ArrayList<>();

    public Department(DepartmentEnum departmentEnum) {
        this.departmentEnum = departmentEnum;
    }

    @Override
    public Iterator<EmployeeComponent> createIterator() {
        if (iterator == null)
            iterator = new Iterator.CompositeIterator(employeeComponents.iterator());
        return iterator;
    }

    public void print() {

        System.out.println(getDepartment());
        System.out.println("----------------------------");

        Iterator<EmployeeComponent> iterator = employeeComponents.iterator();
        while (iterator.hasNext()){
            EmployeeComponent employeeComponent = iterator.next();
            employeeComponent.print();
        }


    }

}
