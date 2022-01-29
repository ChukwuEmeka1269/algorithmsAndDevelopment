package designPrinciples.company;

import java.util.List;

public abstract class Company {

    private String companyName;


    public Company() {
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public abstract  List<Employee> getEmployees();


    public abstract void createSoftware();

}


class Main{
    public static void main(String[] args) {
        List<Company> companies = List.of(
                new GameDevCompany(),
                new OutSourcingCompany()
        );

        for(Company com : companies){
            com.createSoftware();
        }
    }


}
