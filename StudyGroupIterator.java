import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<Student>{

    List<Student> listOfStudents = new ArrayList<Student>();

    int index;

    public StudyGroupIterator(List<Student> listStud) {
        this.listOfStudents = listStud;
    }

    @Override
    public boolean hasNext() {
        return index < listOfStudents.size();
    }

    @Override
    public Student next() {
        return listOfStudents.get(index++);
    }
    
}
