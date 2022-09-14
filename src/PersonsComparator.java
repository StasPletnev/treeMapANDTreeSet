import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {

    protected int minChar;

    public PersonsComparator(int minChar){
        this.minChar = minChar;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().length() > minChar && o2.getSurname().length() > minChar) {
            return Integer.compare(o2.getAge(), o1.getAge());
        }

        int num = Integer.compare(o2.getSurname().length(), o1.getSurname().length());
        if (num == 1 || num == -1) {
            return num;
        } else {
            return Integer.compare(o2.getAge(), o1.getAge());
        }

    }
}
