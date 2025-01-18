import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> fila = new PriorityQueue<String>();
        fila.add("Amit Sharman");
        fila.add("Robert P.");
        fila.add("Jai Senper");
        fila.add("Raj");
        System.out.println("Head: " + fila.element());
        System.out.println("Tail: " + fila.peek());
        System.out.println("iterating the queue elements:");

        Iterator<String> itr = fila.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        fila.remove();
        fila.poll();
        System.out.println("After removing two elements:");
        Iterator<String> itr2 = fila.iterator();

        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
