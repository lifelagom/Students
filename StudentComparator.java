import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
    
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.firstName + o1.lastName).compareTo(o2.firstName+o2.lastName);
    }   
}