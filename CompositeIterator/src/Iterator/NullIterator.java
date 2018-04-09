package Iterator;


import Employee.EmployeeComponent;

import java.util.Iterator;

public class NullIterator implements Iterator<EmployeeComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public EmployeeComponent next() {
        return null;
    }
}
