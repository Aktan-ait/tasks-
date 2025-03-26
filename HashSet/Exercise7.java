package HashSet;

import java.util.HashSet;

public class Exercise7 {
    public static void main(String[] args){
        HashSet<String> original_set = new HashSet<>();
        original_set.add("Red");
        original_set.add("Green");
        original_set.add("Black");
        original_set.add("White");
        original_set.add("Pink");
        original_set.add("Yellow");

        System.out.println("Original HashSet: " + original_set);

        String[] array = original_set.toArray(new String[0]);

        System.out.println("Array elements: ");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
