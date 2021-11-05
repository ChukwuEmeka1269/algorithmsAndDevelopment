package refresher;

public class EnvironmentVar {
    public static void main(String[] args) {

        System.getenv().forEach((k, v) -> {
            System.out.println(k+" : "+ v);
        });
    }
}
