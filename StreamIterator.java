import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class StreamIterator implements Iterator<StudyGroup>{
   
    List<StudyGroup> listOfStream = new ArrayList<StudyGroup>();

    int index;

    public StreamIterator(List<StudyGroup> listOfStream) {
        this.listOfStream = listOfStream;
    }

    @Override
    public boolean hasNext() {
        return index < listOfStream.size();
    }

    @Override
    public StudyGroup next() {
        return listOfStream.get(index++);
    }
    
}
