package HashSet;

import java.util.HashSet;

public class Exercise6 {
    public static void main(String[] args){
        HashSet<String> color_set = new HashSet<>();
        color_set.add("Red");
        color_set.add("Green");
        color_set.add("Black");
        color_set.add("White");
        color_set.add("Pink");
        color_set.add("Yellow");

        System.out.println("Original HashSet: " + color_set);

        HashSet<String> clonedSet = (HashSet<String>) color_set.clone();

        System.out.println("Cloned HashSet: " + clonedSet);
    }
}
