package Iterator;

import Employee.EmployeeComponent;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<EmployeeComponent> {

    private Stack<Iterator<EmployeeComponent>> stack = new Stack<>();


    public CompositeIterator(Iterator<EmployeeComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<EmployeeComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }
    @Override
    public EmployeeComponent next() {
        if (hasNext()) {
            Iterator<EmployeeComponent> iterator = stack.peek();
            EmployeeComponent employeeComponent = iterator.next();
            stack.push(employeeComponent.createIterator());
            return employeeComponent;
        } else {
            return null;
        }
    }

}
