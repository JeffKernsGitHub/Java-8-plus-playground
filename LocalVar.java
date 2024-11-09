


/*

Writen with JDK 23, all examples made with project ceremony

JDK 22:
void main()
void main(String[] args)
public void main()
protected static void main(String[] args)
Static and non-static methods with the same signature, as well as methods with different visibility modifiers with the same signature, are mutually exclusive and lead to a “method is already defined” compiler error.

However, it is possible for a main method with a String[] parameter and a main method without parameters to exist simultaneously in the same .java file:

void main(String[] args) {
  . . .
}

protected static void main() {
  . . .
}
Code language: Java (java)
In this case, the JDK developers specified that the method with the String[] parameter has priority. In the example, the JVM would start void main(String[] args).

With JDK23 run with: java --enable-preview  LocalVar.java

It was not until the third preview phase of the changes, in Java 23, that the new class java.io.IO was introduced – with the following static methods:
void print(Object obj) – prints the passed text or the text representation of the passed object to the console – without a line break at the end.
void println(Object obj) – prints the passed text or the text representation of the passed object to the console – with a line break at the end.
String readln(String prompt) – displays the passed prompt, accepts a user input, and returns it.
An implicitly declared class automatically imports all java.io.IO methods as if the class contained the following import statement:
*/
import static java.io.IO.*;

public class LocalVar {
    void main(){ // new with JDK 23
        // Local Type Varible Inference JDK10, use var, retains assigned type
        var outText = "Printed with the new println";
        println(outText);
    }
 }