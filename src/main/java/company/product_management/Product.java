package company.product_management;

import company.*;

import java.util.ArrayList;
import java.util.List;

public class Product extends BaseCompany {
    private String name;

    private List<Employee> employeeList;

    public Product() {
        super();
        this.name = "Product Company";
        this.employeeList = new ArrayList<>(List.of(
                new Designer()
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
