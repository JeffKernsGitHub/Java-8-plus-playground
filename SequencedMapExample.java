
/*
 *  In JDK 23 java --enable-preview SequencedMapExample.java
 * 
 * SequencedMap is a new interface introduced in Java 21 as part of the Sequenced Collections feature.
 * It extends the traditional Map interface and provides additional methods for managing ordered data within maps.
 * 
 */

import static java.io.IO.println;

import java.util.LinkedHashMap;

public class SequencedMapExample {
    public static void main() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Zero", 0);
        map.put("Ten", 10);
        map.put("Twenty", 20);
        map.put("Thirty", 30);

        println(map); // Output: {Zero=0, Ten=10, Twenty=20, Thirty=30}

        println(map.firstEntry()); // Output: Zero=0
        println(map.lastEntry()); // Output: Thirty=30

        map.putFirst("Negative One", -1);
        map.putLast("Forty", 40);

        println(map); // Output: {Negative One=-1, Zero=0, Ten=10, Twenty=20, Thirty=30, Forty=40}

        println(map.pollFirstEntry()); // Output: Negative One=-1
        println(map.pollLastEntry()); // Output: Forty=40

        println(map.reversed()); // Output: {Forty=40, Thirty=30, Twenty=20, Ten=10, Zero=0}
    }
}