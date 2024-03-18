import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {

    List<Student> listOfStudents = new ArrayList<Student>();

    public void setList(List listStud) {
        this.listOfStudents = listStud;
    }

    public List<Student> getList() {
        return listOfStudents;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudyGroupIterator(listOfStudents);
    }

}