package pr5;

public class Singleton1 {
    private static Singleton1 instance;
    String str;
    private Singleton1 (String str) {
        this.str= str;
    };

    public static Singleton1 getInstance(String str) {
        if (instance == null) {
            instance = new Singleton1(str);
        }
        return instance;
    }
}
