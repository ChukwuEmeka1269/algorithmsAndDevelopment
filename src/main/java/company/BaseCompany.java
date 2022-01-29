package company;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseCompany {
    private String name;
    private List<Employee> employees;

    public BaseCompany() {
        this.name = "Base Company";
        this.employees = new ArrayList<>();
    }


    public List<Employee> getEmployees(){
        return employees;
    }

    public abstract void createSoftware();

    public String getName() {
        return name;
    }
}
