package pr7.decorator;

public class ConcreteDecoratorHello extends Decorator {
    public ConcreteDecoratorHello(Component c) {
        super(c);
    }

    @Override
    public void doOperation() {
        System.out.print("Hello");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New hello operation");
    }
}
