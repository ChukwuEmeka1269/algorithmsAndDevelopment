package designPrinciples.company;

import java.util.List;

public class GameDevCompany extends Company{
    @Override
    public List<Employee> getEmployees() {
        return List.of(
                new Programmer(),
                new Tester()
        );
    }

    @Override
    public void createSoftware() {
        for(Employee em : getEmployees()){
            em.doWork();
        }

        System.out.println("Product ready and available for shipment >>>>");
    }
}
