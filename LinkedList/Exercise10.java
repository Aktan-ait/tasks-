package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exercise10 {
    public static void main(String[] args){
        LinkedList<String> list_colors = new LinkedList<>();
        list_colors.add("Red");
        list_colors.add("Green");
        list_colors.add("Black");
        list_colors.add("Pink");
        list_colors.add("Orange");

        System.out.println("Original list_colors: " + list_colors);

        System.out.println("First element: "+ list_colors.getFirst());
        System.out.println("Last element: "+ list_colors.getLast());
    }
}
