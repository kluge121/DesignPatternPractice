package Run;

import Comparator.PositionComparator;
import Comparator.WorkYearComparator;
import Employee.EmployeeComponent;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class FilterHelper {

    private EmployeeComponent employeeComponent;

    public FilterHelper(EmployeeComponent employeeComponent) {
        this.employeeComponent = employeeComponent;
    }

    public void allEmployeePrinting() {
        employeeComponent.print();
    }


    public void sort(Comparator comparator) {

        Iterator<EmployeeComponent> iterator = employeeComponent.createIterator();
        LinkedList<EmployeeComponent> sortLinkedList = new LinkedList<>();

        while (iterator.hasNext()) {
            EmployeeComponent employeeComponent = iterator.next();
            try {
                employeeComponent.gatherEmployee(sortLinkedList);

            } catch (UnsupportedOperationException ignored) {
            }
        }
        sortLinkedList.sort(comparator);
        for (EmployeeComponent aSortLinkedList : sortLinkedList) {
            aSortLinkedList.print();
        }


    }


}
