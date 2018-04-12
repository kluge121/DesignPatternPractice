package Comparator;

import Employee.EmployeeComponent;

import java.util.Comparator;

public class WorkYearComparator implements Comparator<EmployeeComponent> {

    @Override
    public int compare(EmployeeComponent o1, EmployeeComponent o2) {

        if (o1.getWorkYear() > o2.getWorkYear()) {
            return -1;
        } else if (o1.getWorkYear() < o2.getWorkYear()) {
            return 1;
        } else {
            return 0;
        }
    }
}
