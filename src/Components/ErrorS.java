package Components;
public class ErrorS {
    int line;
    int column;
    Object token;
    boolean unr = true;
    public ErrorS(int line,int column,Object token) {
        this.line = line;
        this.column = column;
        this.token = token;
    }
    public ErrorS(int line,int column,Object token,boolean unr) {
        this.line = line;
        this.column = column;
        this.token = token;
        this.unr = unr;
    }
    public void print() {
        System.out.println(
            "Syntax Error" + (unr ? " in Line " + line + " Column " + column : "") +
            ". This Component was not expected: " + token + "."
        );
    }
    public String toString() {
        return "Syntax Error" + (unr ? " in Line " + line + " Column " + column : "") +
            ". This Component was not expected: " + token + ".";
    }
}