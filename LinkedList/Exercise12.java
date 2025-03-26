package LinkedList;

import java.util.LinkedList;

public class Exercise12 {
    public static void main(String[] args){
        LinkedList<String> list_colors = new LinkedList<>();
        list_colors.add("Red");
        list_colors.add("Green");
        list_colors.add("Black");
        list_colors.add("Pink");
        list_colors.add("Orange");

        System.out.println("Original list_colors: " + list_colors);

        list_colors.remove(3);

        System.out.println("New list: " + list_colors);
    }
}
