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
                    "src/Analyzers",
                    "-symbols",
                    "sym",
                    "-parser",
                    "Sintactico",
                    "src/Analyzers/Sintactico.cup"
                }
            );
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}