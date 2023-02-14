package Generators;
import java.io.File;
public class Scanner {
    public static void main(String[] args) {
        generate();
    }
    public static void generate() {
        jflex.Main.generate(
            new File(
                "src/Analyzers/Lexico.jflex"
            )
        );
    }
}