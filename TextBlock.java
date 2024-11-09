
/*
     * In JDK 23 java --enable-preview TextBlock.java
 
     * Introduced in Java 15, text blocks are a new feature that simplifies the declaration of
     * multi-line strings. They provide a more readable and maintainable way to write string literals,
     * eliminating the need for concatenation, escaping, and indentation management.
     * 
     * Use Cases
        Config files: Text blocks are ideal for declaring large, multi-line configuration strings.
        Templates: They can be used to define template strings for email bodies, HTML fragments, or other structured data.
        Code snippets: Text blocks can contain code snippets, such as SQL queries or XML fragments, making them easier to read and maintain.
     * 
     */

import static java.io.IO.print;
import static java.io.IO.println;

public class TextBlock {
    void main() {

        var example = """
                    Example text
                    with multiple lines
                    and indentation
                """;

        print(example);
        println("");

        // Text blocks do not directly support string interpolation. Interpolation may
        // be considered in a future JEP, String.formatted() can be used. 

        var strA = "Sugar";
        var html = """
                <html>
                    <body>
                        <p>Hello, %s</p>
                    </body>
                </html>
                """.formatted(strA);

        print(html);

    }
}
