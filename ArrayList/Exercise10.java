package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise10 {
    public static void main(String[] args){
        ArrayList<String> list_colors = new ArrayList<>();
        list_colors.add("Red");
        list_colors.add("Green");
        list_colors.add("Orange");
        list_colors.add("White");
        list_colors.add("Black");

        System.out.println("Original list_colors: " + list_colors);

        Collections.shuffle(list_colors);

        System.out.println("Shuffled list_colors: " + list_colors);
    }
}
