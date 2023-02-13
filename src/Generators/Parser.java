package Generators;
public class Parser {
    public static void main(String[] args) {
        generate();
    }
    public static void generate() {
        try {
            java_cup.Main.main(
                new String[] {
                    "-destdir",
                    "src/main/java/Analyzers",
                    "-symbols",
                    "sym",
                    "-parser",
                    "Sintactico",
                    "src/main/java/Analyzers/Sintactico.cup"
                }
            );
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}