package pr6.prototype;

public class Main {
    public static void main(String[] args) {
        Project project = new Project(14565345,"Mirea", "Eugene");
        Project copy = project.copy();
        System.out.println(copy);
    }
}