import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// список учебных групп StudyGroup
public class Stream implements Iterable<StudyGroup>{
    
    List<StudyGroup> listOfStream = new ArrayList<StudyGroup>();

    public void setList(List listOfStream) {
        this.listOfStream = listOfStream;
    }

    public List<StudyGroup> getList() {
        return listOfStream;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return new StreamIterator(listOfStream);
    }

}
