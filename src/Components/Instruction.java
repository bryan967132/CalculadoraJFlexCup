package Components;
public class Instruction {
    String execution = null;
    ErrorS error = null;
    public Instruction(String execution) {
        this.execution = execution;
    }
    public Instruction(ErrorS error) {
        this.error = error;
    }
    public void print() {
        if(execution != null) {
            System.out.println(execution);
        }
        else if(error != null) {
            error.print();
        }
    }
    public String toString() {
        if(execution != null) {
            return execution;
        }
        return error + "";
    }
}