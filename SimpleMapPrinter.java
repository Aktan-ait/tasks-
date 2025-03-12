import java.util.*;

public class SimpleMapPrinter {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<String>();
        tasks.add("Code Review");
        tasks.add("System Update");
        tasks.add("Bug Fixing");

        while (!tasks.isEmpty()) {
            System.out.println("Executing: " + tasks.poll());
        }
    }
}

