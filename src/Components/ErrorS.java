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
        if(unr) {
            System.out.println(
                "Syntax Error in Line " + line + " Column " + column +
                ". This Component was not expected: '" + token + "'."
            );
        }
        else {
            System.out.println(
                "Unrecovered Syntax Error in Line " + line + " Column " + column +
                ". Unrecognized Component: '" + token + "'."
            );
        }
    }
    public String toString() {
        if(unr) {
            return "Syntax Error in Line " + line + " Column " + column +
                ". This Component was not expected: '" + token + "'.";
        }
        return "Unrecovered Syntax Error in Line " + line + " Column " + column +
            ". Unrecognized Component: '" + token + "'.";
    }
}