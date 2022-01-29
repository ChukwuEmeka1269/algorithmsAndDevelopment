package designPrinciples.company;

import java.util.List;

public class OutSourcingCompany extends Company{
    @Override
    public List<Employee> getEmployees() {
        return List.of(
                new Designer(),
                new Tester()
        );
    }

    @Override
    public void createSoftware() {
        for(Employee em : getEmployees()){
            em.doWork();
        }
        System.out.println("Product ready to be outsourced.");
    }
}
