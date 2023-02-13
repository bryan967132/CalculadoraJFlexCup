package Components;
public class ErrorL {
    int line;
    int column;
    String character;
    public ErrorL(int line,int column,String character) {
        this.line = line;
        this.column = column;
        this.character = character;
    }
    public void print() {
        System.out.printf("%-5s%-8s%-10s\n",
            line,
            column,
            "Unrecognized Character: " + character
	);
    }
    public String toString() {
        String error = "";
        error += line;
        for(int i = 1; i <= 5 - String.valueOf(line).length(); i ++) {
            error += " ";
        }
        error += column;
        for(int i = 1; i <= 8 - String.valueOf(column).length(); i ++) {
            error += " ";
        }
        error += "Unrecognized Character: " + character;
        return error;
    }
}