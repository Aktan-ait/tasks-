package ArrayList;

import java.util.ArrayList;

public class Exercise13 {
    public static void main(String[] args){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Black");
        list1.add("White");
        list1.add("Pink");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Black");
        list2.add("Pink");

        ArrayList<String> result = new ArrayList<>();
        for (String e:list1){
            result.add(list2.contains(e) ? "Yes" : "No");
        }
        System.out.println(result);
    }
}
