
/*
  In JDK 23 java --enable-preview Switch.java

Java 14 extends switch so it can be used as either a statement or an expression. In particular, the new Java introduces the following:

A new form of the switch label case ... ->, where only the code to the right of the label is going to be executed if the label is matched. The code to the right of a case ... -> label may be an expression, a block, or a throw statement.
A new yield statement to yield a value that becomes the value of the enclosing switch expression
Multiple constants per case that are separated by commas
With the new Java 14, it’s possible to use both traditional case ... : labels and the new case ... -> labels. It’s important the traditional labels still support fall through by default, but the new ones don't need to.


https://betterprogramming.pub/a-look-at-the-new-switch-expressions-in-java-14-ed209c802ba0

*/

import static java.io.IO.println;

public class Switch {

    enum Person {
        Mozart, Picasso, Goethe, Dostoevsky, Prokofiev, Dali, Gaudi, Bach, Einstein
    }

    void main() {
        print(Person.Mozart);
        print(Person.Dali);
        print(Person.Einstein);

        println("");

        // Pattern Matching for Switch
        var objectvar = new Object();
        var stringvar = "some string";
        objectvar = stringvar;

        println("formatterPatternSwitch(objectvar)="+formatterPatternSwitch(objectvar));

    }

    static void print(Person person) {
        var title = switch (person) {
            case Dali, Picasso -> "painter";
            case Mozart, Prokofiev -> "composer";
            case Goethe, Dostoevsky -> "writer";
            default -> {
                System.out.printf("Oops! I don't know about %s%n", person);
                yield "...";
            }
        };
        System.out.printf("%s was a %s%n", person, title);
    }

    static String formatterPatternSwitch(Object obj) {
        return switch (obj) {
            case Integer i -> String.format("int %d", i);
            case Long l    -> String.format("long %d", l);
            case Double d  -> String.format("double %f", d);
            case String s  -> String.format("String %s", s);
            default        -> obj.toString();
        };
    }

}
