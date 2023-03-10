package Interface;
import Analyzers.Lexico;
import Analyzers.Sintactico;
import java.io.BufferedReader;
import java.io.StringReader;
import javax.swing.JTextPane;
public class Analyze {
    public void analyze(JTextPane input,JTextPane output1,JTextPane output) {
        try {
            Lexico scanner = new Lexico(
                new BufferedReader(
                    new StringReader(input.getText())
                )
            );
            Sintactico parser = new Sintactico(scanner);
            parser.parse();
            output1.setText(scanner.getTokens() + scanner.getErrors());
            output.setText("Compile:\n" + parser.getExecution());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}