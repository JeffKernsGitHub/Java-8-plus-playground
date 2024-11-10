/*
 * See Obsidian article
 * In JDK 23 java --enable-preview StreamTerminalOperationsExample.java
 * 
 */

import static java.io.IO.println;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTerminalOperationsExample {
    public static void main() {
        // Sample data
        List<String> names = Arrays.asList(
            "Reflection", "Collection", "Stream",
            "Structure", "Sorting", "State"
        );

        // forEach: Print each name
        println("forEach:");
        names.stream().forEach(System.out::println);

        // collect: Collect names starting with 'S' into a list
        List<String> sNames = names.stream()
                                   .filter(name -> name.startsWith("S"))
                                   .collect(Collectors.toList());
        println("\ncollect (names starting with 'S'):");
        sNames.forEach(java.io.IO::println);

        // reduce: Concatenate all names into a single string
        String concatenatedNames = names.stream().reduce(
            "",
            (partialString, element) -> partialString + " " + element
        );
        println("\nreduce (concatenated names):");
        println(concatenatedNames.trim());

        // count: Count the number of names
        long count = names.stream().count();
        println("\ncount:");
        println(count);

        // findFirst: Find the first name
        Optional<String> firstName = names.stream().findFirst();
        println("\nfindFirst:");
        firstName.ifPresent(java.io.IO::println);

        // allMatch: Check if all names start with 'S'
        boolean allStartWithS = names.stream().allMatch(
            name -> name.startsWith("S")
        );
        println("\nallMatch (all start with 'S'):");
        println(allStartWithS);

        // anyMatch: Check if any name starts with 'S'
        boolean anyStartWithS = names.stream().anyMatch(
            name -> name.startsWith("S")
        );
        println("\nanyMatch (any start with 'S'):");
        println(anyStartWithS);
    }
}