package pr7.decorator;

import java.io.*;

public class ConcreteComponent implements Component {
    @Override
    public void doOperation() {
        System.out.print("World!");
    }
}
