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
        if (stack.empty()) {  // 스택이 비어있다면
            return false;  // 더 이상 탐색할 것이 없다,.
        } else { // 비어있지 않다면
            Iterator<EmployeeComponent> iterator = stack.peek(); // 스택최상단 이터레이터를 가져온다
            if (!iterator.hasNext()) { // 그 이터레이터의 다음 탐색할 것이 있지 않다면
                stack.pop();  // 위에서 가져온 stack.peek()와 같은것을 pop한다.
                return hasNext(); // 그리고는 현재 내 스택에 있는 다음 hasNext() 진행
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
