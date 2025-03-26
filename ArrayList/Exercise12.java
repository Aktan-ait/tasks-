package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise12 {
    public static void main(String[] args){
        ArrayList<String> list_colors = new ArrayList<>();
        list_colors.add("Red");
        list_colors.add("Green");
        list_colors.add("Orange");
        list_colors.add("White");
        list_colors.add("Black");

        System.out.println("Original list_colors: " + list_colors);

        List<String> sublist = list_colors.subList(0, 3);

        System.out.println("Extracted portion: " + sublist);
    }
}
