import java.util.Comparator;
//сравнить количество групп входящих в поток
public class StreamComparator implements Comparator<Stream>{
    
    @Override
    public int compare(Stream o1, Stream o2) {
        if ((o1.listOfStream.size())>(o2.listOfStream.size())) {
            return o1.listOfStream.size();
        }
        else {return o2.listOfStream.size();}
    }
}
