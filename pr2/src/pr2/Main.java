package pr2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<Human>(10);
        Human human_1 = new Human(20, "Иван", "Смирнов", LocalDate.of(1996, 4, 20), 52);
        Human human_2 = new Human(19, "Максим", "Карпов", LocalDate.of(2001,5,7), 80);
        Human human_3 = new Human(50, "Консантин", "Сидоров", LocalDate.of(1962, 2, 2), 96);
        Human human_4 = new Human(60, "Андрей", "Анисимов", LocalDate.of(1986, 5, 12), 59);
        Human human_5 = new Human(18, "Леонид", "Покровский", LocalDate.of(2001, 12, 1), 75);
        Human human_6 = new Human(17, "Сергей", "Анисимов", LocalDate.of(2000, 5, 28), 75);
        Human human_7 = new Human(54, "Валерий", "Жмышенко",LocalDate.of(1967, 2, 19), 80);
        Human human_8 = new Human(53, "Ольга", "Белова", LocalDate.of(1968, 12, 12), 60);
        Human human_9 = new Human(19, "Евгений", "Артюх", LocalDate.of(2001, 8, 23), 80);
        Human human_10 = new Human(26, "Игорь", "Петров", LocalDate.of(1993, 12, 7), 75);
        

        list.add(human_1);
        list.add(human_2);
        list.add(human_3);
        list.add(human_4);
        list.add(human_5);
        list.add(human_6);
        list.add(human_7);
        list.add(human_8);
        list.add(human_9);
        list.add(human_10);


        System.out.print("\nCортировка по второй букве имени:\n");
        Stream<Human> stream = list.stream();
        stream.sorted(Comparator.comparing(Human::getFirstName))
                .forEach(System.out::println);



        System.out.print("\nФильтрация по весу кратному 10: \n");
        Stream<Human> stream2 = list.stream();
        stream2.filter(a -> a.getWeight() % 10 == 0)
                .forEach(System.out::println);



        System.out.println("\nСортировка по произведению веса на возраст:\n");
        Stream<Human> stream3 = list.stream();
        stream3.sorted(Comparator.comparing(Human::multiply))
                .forEach(System.out::println);



        System.out.println("\nПроизведение весов:\n");
        Stream<Human> numbersStream = list.stream();
        Optional<Integer> result = numbersStream.map(human -> human.getWeight()).reduce((x, y)->x*y);
        System.out.print(result.get());
    }
}
