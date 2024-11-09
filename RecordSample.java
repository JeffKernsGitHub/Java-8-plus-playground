
/*
 * In JDK 23 java --enable-preview RecordSample.java
 * 
 Java Record Classes, introduced in Java 14, are a new type of class that simplifies the creation of immutable data carriers. They are designed to reduce boilerplate code and provide a more concise way to define classes that primarily hold data.

Key Characteristics
Immutable: Record classes are immutable by default, meaning that once an object is created, its state cannot be changed.
Compact constructor: Record classes have a compact constructor that initializes the fields with the given values.
Generated methods: The compiler generates the following methods:
equals(): Compares two record objects for equality.
hashCode(): Returns a hash code for the record object.
toString(): Returns a string representation of the record object.
Accessor methods (getters) for each field.
No explicit equals() and hashCode() implementation: The compiler generates these methods, so you don’t need to write them explicitly.
No setter methods: Record classes are immutable, so there’s no need for setter methods.

Benefits
Reduced boilerplate code: Record classes eliminate the need to write explicit equals(), hashCode(), and toString() methods.
Improved readability: The concise syntax makes your code more readable and easier to maintain.
Immutable by default: Record classes ensure immutability, which helps prevent unintended changes to data.
Use Cases
Data transfer objects (DTOs): Record classes are ideal for creating immutable DTOs that carry data between layers of your application.
Configuration objects: Use record classes to define configuration objects that are immutable and easy to work with.
Data modeling: Record classes can be used to model simple data structures, such as points, rectangles, or timestamps.
Limitations
No inheritance: Record classes cannot extend other classes or implement interfaces.
No static members: Record classes cannot declare static members, such as static fields or methods.
Limited customization: While you can annotate record components, you have limited control over the generated methods and behavior.
 
* 
 */

import static java.io.IO.println;

import java.util.ArrayList;

public class RecordSample {

    void main() {
        ArrayList<Person> students = new ArrayList<Person>();

        students.add(new Person("John Doe", 20));
        students.add(new Person("Jane Doe", 19));
        students.add(new Person("Jughead", 21));
        students.add(new Person("George Leroy Tirebiter", 21));

        students.stream().forEach(student -> println(student));
    }

    protected record Person(String name, int age) {
    }
}