package Run;

import Employee.Department;
import Employee.Employee;
import Employee.EmployeeComponent;
import Enum.DepartmentEnum;
import Enum.PositionEnum;

public class Client {

    public static void main(String args[]) {

        EmployeeComponent company = new Department("한밭 컴퍼니", DepartmentEnum.Company);
        EmployeeComponent sale = new Department("영업부", DepartmentEnum.Sale);
        EmployeeComponent product = new Department("생산부", DepartmentEnum.Product);
        EmployeeComponent humanResource = new Department("인사부", DepartmentEnum.HumanResource);


        //Company add (root)
        company.add(new Employee("김회장", DepartmentEnum.Company, PositionEnum.Director, 14));
        company.add(sale);
        company.add(product);
        company.add(humanResource);

        //Sals add
        sale.add(new Employee("김부장", DepartmentEnum.Sale, PositionEnum.GerneralManager, 13));
        EmployeeComponent sale1Team = new Department("영업1팀", DepartmentEnum.Sale);
        sale.add(sale1Team);
        sale1Team.add(new Employee("배사원", DepartmentEnum.Sale, PositionEnum.Employee, 2));
        sale1Team.add(new Employee("서사원", DepartmentEnum.Sale, PositionEnum.Employee, 3));

        //Product add
        product.add(new Employee("박부장", DepartmentEnum.Product, PositionEnum.GerneralManager, 15));

        //HumanResource add
        humanResource.add(new Employee("이부장", DepartmentEnum.HumanResource, PositionEnum.GerneralManager, 10));
        EmployeeComponent human1Team = new Department("인사1팀", DepartmentEnum.HumanResource);
        EmployeeComponent human2Team = new Department("인사2팀", DepartmentEnum.HumanResource);
        humanResource.add(human1Team);
        humanResource.add(human2Team);


        human1Team.add(new Employee("이과장", DepartmentEnum.HumanResource, PositionEnum.Manager, 11));
        EmployeeComponent human1TeamEmployee = new Department("인사1팀원", DepartmentEnum.HumanResource);
        human1Team.add(human1TeamEmployee);
        human1TeamEmployee.add(new Employee("김사원", DepartmentEnum.HumanResource, PositionEnum.Employee, 3));
        human1TeamEmployee.add(new Employee("강사원", DepartmentEnum.HumanResource, PositionEnum.Employee, 1));

        human2Team.add(new Employee("이대리", DepartmentEnum.HumanResource, PositionEnum.AssitantManager, 5));

        FilterHelper filterHelper = new FilterHelper(company);
//        filterHelper.allEmployeePrinting();

        filterHelper.workYearSort();
        System.out.println();
        filterHelper.positionSort();

    }


}
