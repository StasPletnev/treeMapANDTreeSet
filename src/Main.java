import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //int minChar = 8;
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dima", "Pupkovich", 25));
        list.add(new Person("Sasha", "Dedovich", 76));
        list.add(new Person("Olya", "Babushkina", 30));
        list.add(new Person("Stas", "Pletnev", 21));
        list.add(new Person("Dany", "Akrestl", 15));

        list.sort((Person o1, Person o2) -> {
            if (o1.getSurname().length() > 8 && o2.getSurname().length() > 8) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
            int num = Integer.compare(o2.getSurname().length(), o1.getSurname().length());
            if (num == 1 || num == -1) {
                return num;
            } else {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        });

        System.out.println(list);
    }
}
