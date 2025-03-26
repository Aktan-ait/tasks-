package TreeSet;

import java.util.TreeSet;

public class Exercise5 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Orange");
        treeSet.add("White");
        treeSet.add("Black");

        System.out.println("TreeSet: " + treeSet);

        String firstElement = treeSet.first();
        System.out.println("Firs Element: " + firstElement);

        String lastElement = treeSet.last();
        System.out.println("Last Element: " + lastElement);
    }
}

