package katryn;

public class SingletonClass {

    private static SingletonClass instance;

    private static int a = 5;
    private static int b = 10;

    private SingletonClass (){

    }

    public static SingletonClass getSingletonInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }

    static {
        b = a * 5;
    }

    public static void main(String[] args) {
        System.out.println("The value of b = "+ b);
        System.out.println(a + b);
    }
}
