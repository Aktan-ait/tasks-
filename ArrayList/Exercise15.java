package ArrayList;

import java.util.ArrayList;

public class Exercise15 {
    public static void main(String[] args){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Black");
        list1.add("White");
        list1.add("Pink");

        System.out.println("Firs colors array: " + list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Gold");
        list2.add("Purple");
        list2.add("Gray");

        System.out.println("Second colors array: " + list2);

        ArrayList<String> unification = new ArrayList<>();
        unification.addAll(list1);
        unification.addAll(list2);

        System.out.println("Unification: "+ unification);
    }
}
