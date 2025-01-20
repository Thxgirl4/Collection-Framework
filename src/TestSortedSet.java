//Usando SortedSet e TreeSet

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
public static void main(String[] args) {
    String[] colors = {"yellow ", "green ", "black ", "tan ", "grey ",
                     "white ", "orange ", "red ", "green " };

    SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));

    System.out.print("sorted set: ");
    printSet(tree);

    //Obtem headSet com base em "orange"
    System.out.print("headSet (\"orange\"): ");
    printSet(tree.headSet("orange"));

    //obtém tailSet baseado em "orange"
    System.out.print("tailSet (\"orange\"): ");
    printSet(tree.tailSet("orange"));

    //obtém primeiro e último elementos
    System.out.printf("first: %s%n", tree.first());
    System.out.printf("last: %s%n", tree.last());
 }

 //envia SortedSet para a saída usando a instrução for aprimorada
    private static void printSet(SortedSet<String> set) {
    for(String s : set)
        System.out.printf("%s", s);
     System.out.println();
    }
}
