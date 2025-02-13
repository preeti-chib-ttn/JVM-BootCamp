package BeyondJava.Day1;
/*Q5) Demonstrate the use of repeat(), strip(),
trim(), isBlank(), indent(), transform(),
stripIndent(), translateEscapes(),
tripleQuotes and formatted() methods.*/
public class Question5 {
    public static void main(String[] args) {
        String str = "  This is a text for testing ";

        System.out.println("repeat(): " + "Java ".repeat(3));

        System.out.println("strip(): '" + " this is a string with \t \t \n  ".strip() + "'");
        System.out.println("trim(): '" + "  this is a string with \t \t \n  ".trim() + "'");
        System.out.println("isBlank(): " + " \n  ".isBlank());
        System.out.println("indent(): \n" + "Java Assignment".indent(50));
        System.out.println("indent(): \n" + "Beyond Java".indent(50).indent(-10));
        System.out.println("transform(): " + str.transform(String::toCharArray));
        System.out.println("stripIndent():\n" + "    Line 1\n    Line 2".stripIndent());
        System.out.println("translateEscapes(): " + "Hello\\nWorld".translateEscapes());
        System.out.println("formatted(): " + "Name: %s, Age: %d".formatted("Preeti", 23));

    }
}
