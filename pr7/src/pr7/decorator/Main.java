package pr7.decorator;


public class Main {

    public static void main(String[] args) {
        Decorator c = new ConcreteDecoratorHello(new ConcreteDecoratorHello(new ConcreteDecoratorHello(new ConcreteComponent())));
        System.out.println("Результат выполнения программы \"Hello, World!\": ");
        c.doOperation();
        System.out.println("\nNew hello operation: ");
        c.newOperation();
    }
}
