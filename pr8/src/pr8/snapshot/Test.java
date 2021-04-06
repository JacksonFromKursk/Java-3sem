package pr8.snapshot;

public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("вкл");
        System.out.printf("Статус %s\n", originator.getState());
        caretaker.setMemento(originator.saveState());

        originator.setState("выкл");
        System.out.printf("Статус %s\n", originator.getState());

        originator.restoreState(caretaker.getMemento());
        System.out.printf("Статус %s\n", originator.getState());
    }
}
