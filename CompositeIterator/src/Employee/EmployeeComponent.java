package Employee;

import java.util.*;

import Enum.PositionEnum;
import Enum.DepartmentEnum;

public abstract class EmployeeComponent {

    public void add(EmployeeComponent employeeComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(EmployeeComponent employeeComponent) {
        throw new UnsupportedOperationException();
    }

    public EmployeeComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getNmae() {
        throw new UnsupportedOperationException();
    }

    public String getDepartment() {
        throw new UnsupportedOperationException();
    }

    public PositionEnum getPosition() {
        throw new UnsupportedOperationException();
    }

    public int getWorkYear() {
        throw new UnsupportedOperationException();
    }

    public abstract Iterator<EmployeeComponent> createIterator();

    public void print() {
        throw new UnsupportedOperationException();
    }

    public void gatherEmployee(LinkedList<EmployeeComponent> employeelist) {
        throw new UnsupportedOperationException();
    }


}
