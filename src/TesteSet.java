import java.util.*;

public class TesteSet {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "green", "gray",
                "orange", "tan", "white", "cyan", "peach", "gray", "orange" };
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s\n", list);

        //elimina duplicatas, então imprime os valores únicos
        printNonDuplicates(list);
    }

    private static void printNonDuplicates(Collection<String> values){
        Set<String> set = new HashSet<>(values);
        System.out.printf("%nUnique values:");

        for(String value : set)
            System.out.printf(" %s", value);

        System.out.println();

    }
}
