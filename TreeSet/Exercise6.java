package TreeSet;

import java.util.TreeSet;

public class Exercise6 {
    public static void main(String[] args){
        TreeSet<String> original_set = new TreeSet<String>();
        original_set.add("Red");
        original_set.add("Green");
        original_set.add("Black");
        original_set.add("Pink");
        original_set.add("orange");

        System.out.println("Original tree set:" + original_set);
        TreeSet<String> new_t_set = (TreeSet<String>)original_set.clone();
        System.out.println("Cloned tree list: " + original_set);
    }
}
