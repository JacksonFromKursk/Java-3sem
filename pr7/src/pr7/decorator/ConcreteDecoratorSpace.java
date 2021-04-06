package pr7.decorator;

import java.util.Base64;

public class ConcreteDecoratorSpace extends Decorator {
    public ConcreteDecoratorSpace(Component c) {
        super(c);
    }

    @Override
    public void doOperation() {
        System.out.print(" ");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New space operation");
    }
}
