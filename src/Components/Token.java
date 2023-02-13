package Components;
public class Token {
    String lexeme;
    int line;
    int column;
    String type;
    public Token(String lexeme,int line,int column,String type) {
        this.lexeme = lexeme;
        this.line = line;
        this.column = column;
        this.type = type;
    }
    public void print() {
        System.out.printf("%-15s%-5s%-8s%-10s\n",
            lexeme,
            line,
            column,
            type
	);
    }
    public String toString() {
        String token = "";
        token += lexeme;
        for(int i = 1; i <= 15 - String.valueOf(lexeme).length(); i ++) {
            token += " ";
        }
        token += line;
        for(int i = 1; i <= 5 - String.valueOf(line).length(); i ++) {
            token += " ";
        }
        token += column;
        for(int i = 1; i <= 8 - String.valueOf(column).length(); i ++) {
            token += " ";
        }
        token += type;
        return token;
    }
}