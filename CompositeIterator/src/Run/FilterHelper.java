package Run;


import Employee.Employee;
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
            System.out.println("반복------------------- " + employeeComponent.getNmae());

            try {
                if (employeeComponent instanceof Employee)
                    employeeComponent.gatherEmployee(sortLinkedList);

            } catch (UnsupportedOperationException ignored) {

            }

        }
        sortLinkedList.sort(comparator);


        System.out.println();
        for (EmployeeComponent aSortLinkedList : sortLinkedList) {
            aSortLinkedList.print();
        }


    }


}
