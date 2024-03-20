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

        List<Student> listStud1 = new ArrayList<Student>(List.of(
        new Student("Михоил", "Карпов", 30),
        new Student("Владимир", "Васильев", 10),
        new Student("Влад", "Карпов", 19),
        new Student("Сергей", "Васильев", 23)));

        StudyGroup iterStud = new StudyGroup();
        StudyGroup iterStud1 = new StudyGroup();
        StudyGroup iterStud2 = new StudyGroup();
        iterStud.setList(listStud);
        iterStud1.setList(listStud1);
        iterStud1.setList(listStud);
        Iterator<Student> iter = iterStud.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());            
        }

        List<StudyGroup> listStream = new ArrayList<StudyGroup>();
        List<StudyGroup> listStream1 = new ArrayList<StudyGroup>();
        listStream.add(iterStud);
        listStream.add(iterStud1);
        listStream1.add(iterStud2);
        Stream stream = new Stream();
        Stream stream1 = new Stream();
        stream.setList(listStream);
        stream1.setList(listStream1);
        Iterator<StudyGroup> iterStream = stream.iterator();
        System.out.println("___________________");
        System.out.println("Поток групп:");
        while (iterStream.hasNext()) {
            System.out.println(iterStream.next());            
        }

        StreamComparator compar = new StreamComparator();
        System.out.println("Максимальное количество групп: "+compar.compare(stream, stream1));
    }
}