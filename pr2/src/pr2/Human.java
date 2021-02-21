package pr2;
import java.time.LocalDate;
public class Human {
    int age;
    String firstName;
    String lastName;
    LocalDate birthDate;
    int weight;

    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName.substring(1);
    }

    public int getWeight() {
        return weight;
    }

    public int multiply(){
        return age*weight;
    }
    @Override
    public String toString() {
        return "Human " +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", weight=" + weight;
    }
}

