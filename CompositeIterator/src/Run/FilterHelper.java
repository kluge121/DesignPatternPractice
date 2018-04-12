package Run;

import Comparator.PostionComparator;
import Comparator.WorkYearComparator;
import Employee.EmployeeComponent;

import java.util.LinkedList;

public class FilterHelper {

    private EmployeeComponent employeeComponent;
    private LinkedList<EmployeeComponent> employeeObjectsList;

    public FilterHelper(EmployeeComponent employeeComponent) {
        this.employeeComponent = employeeComponent;
    }

    public void allEmployeePrinting() {
        employeeComponent.print();
    }


    public void positionSort() {
        employeeObjectsList = new LinkedList<>();
        employeeComponent.gatherEmployee(employeeObjectsList);
        employeeObjectsList.sort(new PostionComparator());

        for (int i = 0; i < employeeObjectsList.size(); i++) {
            employeeObjectsList.get(i).print();
        }


    }

    public void workYearSort() {
        employeeObjectsList = new LinkedList<>();
        employeeComponent.gatherEmployee(employeeObjectsList);
        employeeObjectsList.sort(new WorkYearComparator());

        for (int i = 0; i < employeeObjectsList.size(); i++) {
            employeeObjectsList.get(i).print();
        }
    }


}
