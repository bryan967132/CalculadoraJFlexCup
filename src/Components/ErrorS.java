package Components;
public class ErrorS {
    int line;
    int column;
    Object token;
    public ErrorS(int line,int column,Object token) {
        this.line = line;
        this.column = column;
        this.token = token;
    }
    public void print() {
        System.out.println(
            "Syntax Error" + (token != null ? " in Line " + line + " Column " + column : "") +
            ". This Component was not expected: " + (token != null ? token : "EOF") + "."
        );
    }
    public String toString() {
        return "Syntax Error" + (token != null ? " in Line " + line + " Column " + column : "") +
            ". This Component was not expected: " + (token != null ? token : "EOF") + ".";
    }
}