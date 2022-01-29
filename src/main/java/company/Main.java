package company;

import company.game_dev.GameDev;
import company.outsourcing.Outsourcing;
import company.product_management.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        createApp(new GameDev());
        System.out.println("<><><><><><><><><><><><><><>");
        createApp(new Outsourcing());
        System.out.println("<><><><><><><><><><><><><><>");
        createApp(new Product());

    }

    private static void createApp(BaseCompany baseCompany) {
        List<Employee> employees = baseCompany.getEmployees();
        System.out.println("Employees Of "+ baseCompany.getName() +" Company: ");
        for(Employee employee: employees){
            System.out.println(employee.getName());
        }

        for(Employee employee: employees){
            employee.doWork();
        }

        System.out.println("Software is ready.");
    }


}
