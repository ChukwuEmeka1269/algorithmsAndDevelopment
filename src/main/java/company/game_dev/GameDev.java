package company.game_dev;

import company.*;

import java.util.ArrayList;
import java.util.List;

public class GameDev extends BaseCompany {
    private String name;

    private List<Employee> employeeList;

    public GameDev() {
        super();
        this.name = "Game Dev";
        this.employeeList = new ArrayList<>(List.of(
                new Designer(),
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
