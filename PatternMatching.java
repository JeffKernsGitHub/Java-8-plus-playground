
/*
 * Instanceof Pattern Matching JDK16
 * In JDK 23 java --enable-preview PatternMatching.java
 * Also see Switch.java for switch pattern mapping!
 */
import static java.io.IO.println;

public class PatternMatching {

    void main() {

        var objectvar = new Object();
        var stringvar = "some string";
        objectvar = stringvar;

        patternFunction(objectvar);

    }

    /*
     * Instead of:
     * 
     * if(o instance of String){
     *    String s = (String) o;
     *    println(s);
     * }
     * 
     * 
     */
    private void patternFunction(Object o) {

        if (o instanceof String s)
            println(s);
    }

}
