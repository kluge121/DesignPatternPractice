package Employee;

import java.util.Iterator;

public abstract class EmployeeComponent {


    public String getNmae() {
        throw new UnsupportedOperationException();
    }

    public Enum.DepartmentEnum getDepartment() {
        throw new UnsupportedOperationException();
    }

    public Enum.PositionEnum getPosition() {
        throw new UnsupportedOperationException();
    }

    public int getWorkYear() {
        throw new UnsupportedOperationException();
    }

    public abstract Iterator<EmployeeComponent> createIterator();

    public void print() {
        throw new UnsupportedOperationException();
    }

}
