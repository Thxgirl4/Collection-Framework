import java.util.Iterator;
import java.util.Vector;

public class TesteVector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Ravi");
        v.add("Ajay");
        v.add("Vijay");
        v.add("Ravi");
        v.add("Rervi");

        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
