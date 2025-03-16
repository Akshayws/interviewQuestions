package Ak;

// Demonstrating the use of ListIterator for forward and backward iteration
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorPractice {

    public static void main(String[] args) {
        // Create a list and add elements to it
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        // Forward iteration using ListIterator
        ListIterator<String> iterator = list.listIterator();
        System.out.println("Forward Iteration:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Add an element at the current position of the iterator
        // Note: Adding here could affect backward traversal
        iterator.add("O");

        // Backward iteration using ListIterator
        System.out.println("Backward Iteration:");
        while (iterator.hasPrevious()) {
            String ele = iterator.previous();

            // Replace "a" with "T" during backward traversal
            if (ele.equals("a")) {
                iterator.set("T");
                System.out.println("Replaced 'a' with 'T'");
            }

           
        }
        System.out.println(list);
    }
}
