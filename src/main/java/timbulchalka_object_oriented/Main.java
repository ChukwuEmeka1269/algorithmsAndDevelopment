package timbulchalka_object_oriented;

public class Main {
    public static void main(String[] args) {
//        BankAccount alexAccount = new BankAccount();
//        alexAccount.setBalance(5000D);
//        alexAccount.setCustomerName("Alex");
//        alexAccount.setEmail("alex67@gmail.com");
//        alexAccount.setPhoneNumber("09087765432");
//        alexAccount.setAccountNumber(2282899275D);
//        System.out.println(alexAccount.getCustomerName());
//        System.out.println(alexAccount.getAccountNumber());
//        System.out.println(alexAccount.getEmail());
//        System.out.println(alexAccount.getPhoneNumber());
//        System.out.println(alexAccount.getBalance());
//        alexAccount.depositFund(2500D);
//        System.out.println("New balance after deposit = "+alexAccount.getBalance());
//        alexAccount.withdrawFund(5000D);
//        System.out.println("Remaining balance after withdrawal = " + alexAccount.getBalance());
//        alexAccount.withdrawFund(1500D);
//        System.out.println("Amount remaining = " + alexAccount.getBalance());

//        Wall wall = new Wall(1.125,-1.0);
//        System.out.println(wall.getWidth());
//        System.out.println("Area of wall = "+ wall.getArea());
//        wall.setHeight(-12.5);
//        System.out.println("Area of wall = "+ wall.getArea());

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        Point point = new Point();
        System.out.println("distance(0, 0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2, 2) = " + first.distance(2,2));
        System.out.println("distance(point) = " + point.distance());




    }
}
