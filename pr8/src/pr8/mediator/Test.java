package pr8.mediator;

public class Test  {

    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();
        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);
        m.setColleague1(c1);
        m.setColleague2(c2);
        m.send("Го по пивку",c1);
        m.send("Ок, го", c2);
    }
}

