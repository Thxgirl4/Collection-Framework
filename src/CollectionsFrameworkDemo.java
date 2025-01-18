import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsFrameworkDemo {
    //Define a static method to showcase various collection usages
    static void showcaseCollections() {
        //initialize an array of integers
        int [] numbersArray = new int[]{1, 2, 3, 4};
        //Create an ArrayList to hold integer objects
        List<Integer>numbersList = new ArrayList<>();

        //create a hashmap to map integer keys to string values
        Map<Integer, String>numbersMap = new HashMap<>();

        //Add elements to the ArrayList
        numbersList.add(1);
        numbersList.add(2);

        //put key-value pairs into the hashmap
        numbersMap.put(1, "alpha");
        numbersMap.put(2, "beta");

        //print the first element of array
        System.out.println("First element of numbersArray:" + numbersArray[0]);

        //print the first element of ArrayList
        System.out.println("Firste element of numbersList:" + numbersList.get(0));

        //print the value associated with key 1 in the HashMap
        System.out.println("Value for key 1 in numbersMap:" + numbersMap.get(1));

        //Header for iterating over the array
        System.out.println("\n Iterating over numbersArray: ");
        //Iterate through the array and print each element
        for(int num : numbersArray){
            System.out.println("Element: " + num);
        }

        //Header for  iterating over the HashMap.
        System.out.println("\nIterating over numbersMap: ");
        // Iterate through the HashMap and print each key-value pair.
        for(Map.Entry<Integer, String>entry : numbersMap.entrySet()){
            System.out.println("Key:" + entry.getKey() + ", Value: " + entry.getValue());

        }

    }
    // The main method to run the showcaseCollectionsUsage method.
    public static void main(String[] args) {
        showcaseCollections();
    }
}
