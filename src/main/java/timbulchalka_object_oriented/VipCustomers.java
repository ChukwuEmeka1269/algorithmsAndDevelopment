package timbulchalka_object_oriented;

public class VipCustomers {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomers() {
        this("Default name", 150000, "default@gmail.com");
        System.out.println("Call to 3rd constructor");
    }

    public VipCustomers(String name, int creditLimit) {
        this(name, creditLimit, "me@mgmail.com");
        System.out.println("2nd constructor called");
    }

    public VipCustomers(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
