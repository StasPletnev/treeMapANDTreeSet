import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dima", "Pupkovich", 25));
        list.add(new Person("Sasha", "Dedovich", 76));
        list.add(new Person("Olya", "Babushkina", 30));
        list.add(new Person("Stas", "Pletnev", 21));
        list.add(new Person("Dany", "Akrestl", 15));

        list.sort(new PersonsComparator(8));
        System.out.println(list);
    }
}
