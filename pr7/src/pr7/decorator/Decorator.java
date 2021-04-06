package pr7.decorator;

abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component c) {
        component = c;
    }

    @Override
    public void doOperation() {
        component.doOperation();
    }

    public void newOperation() {
        System.out.println("Do Nothing");
    }
}
