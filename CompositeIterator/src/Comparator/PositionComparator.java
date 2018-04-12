package Comparator;

import Employee.EmployeeComponent;

import java.util.Comparator;

public class PositionComparator implements Comparator<EmployeeComponent> {

    @Override
    public int compare(EmployeeComponent o1, EmployeeComponent o2) {

        if (o1.getPosition().getValue() > o2.getPosition().getValue()) {
            return -1;
        } else if (o1.getPosition().getValue() < o2.getPosition().getValue()) {
            return 1;
        } else {
            return 0;
        }

    }
}
