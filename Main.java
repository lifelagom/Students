import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<Student> listStud = new ArrayList<Student>(List.of(
        new Student("Иван", "Иванов", 20),
        new Student("Александр", "Васильев", 30),
        new Student("Влад", "Карпов", 27),
        new Student("Сергей", "Боков", 23)));

        StudyGroup iterStud = new StudyGroup();
        iterStud.setList(listStud);
        Iterator<Student> iter = iterStud.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());            
        }

        System.out.println(listStud.get(0).compareTo(listStud.get(2)));
        Collections.sort(listStud, new StudentComparator());
        System.out.println(listStud);
    }
}