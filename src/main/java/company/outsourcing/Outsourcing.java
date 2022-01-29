package company.outsourcing;

import company.BaseCompany;
import company.Employee;
import company.Programmer;
import company.Tester;

import java.util.ArrayList;
import java.util.List;

public class Outsourcing extends BaseCompany {
    private String name;

    private List<Employee> employeeList;

    public Outsourcing() {
        super();
        this.name = "Outsourcing Company";
        this.employeeList = new ArrayList<>(List.of(
                new Programmer(),
                new Tester()
        ));
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeList;
    }

    @Override
    public void createSoftware() {
        for(Employee employee: getEmployees()){
            employee.doWork();
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}
