package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise14 {
    public static void main(String[] args){
        ArrayList<String> list_colors = new ArrayList<>();
        list_colors.add("Red");
        list_colors.add("Green");
        list_colors.add("Black");
        list_colors.add("White");
        list_colors.add("Pink");

        System.out.println("Original list_colors: " + list_colors);

        Collections.swap(list_colors,2,4);

        System.out.println("After swapping: " + list_colors);
    }
}
