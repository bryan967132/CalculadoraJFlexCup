
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analyzers;

import Components.ErrorS;
import Components.Instruction;
import java_cup.runtime.*;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\015\000\002\002\004\000\002\002\005\000\002\003" +
    "\004\000\002\003\003\000\002\003\004\000\002\004\007" +
    "\000\002\005\004\000\002\005\005\000\002\005\005\000" +
    "\002\005\005\000\002\005\005\000\002\005\003\000\002" +
    "\005\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\035\000\004\011\005\001\002\000\004\002\037\001" +
    "\002\000\006\003\011\022\010\001\002\000\004\012\036" +
    "\001\002\000\010\003\011\012\ufffe\022\010\001\002\000" +
    "\004\007\013\001\002\000\004\022\010\001\002\000\004" +
    "\012\ufffd\001\002\000\010\005\015\014\016\017\014\001" +
    "\002\000\016\006\ufff6\010\ufff6\013\ufff6\014\ufff6\015\ufff6" +
    "\016\ufff6\001\002\000\010\005\015\014\016\017\014\001" +
    "\002\000\010\005\015\014\016\017\014\001\002\000\014" +
    "\010\020\013\022\014\023\015\021\016\024\001\002\000" +
    "\004\004\031\001\002\000\010\005\015\014\016\017\014" +
    "\001\002\000\010\005\015\014\016\017\014\001\002\000" +
    "\010\005\015\014\016\017\014\001\002\000\010\005\015" +
    "\014\016\017\014\001\002\000\016\006\ufff7\010\ufff7\013" +
    "\ufff7\014\ufff7\015\ufff7\016\ufff7\001\002\000\016\006\ufff9" +
    "\010\ufff9\013\ufff9\014\ufff9\015\021\016\024\001\002\000" +
    "\016\006\ufffa\010\ufffa\013\ufffa\014\ufffa\015\021\016\024" +
    "\001\002\000\016\006\ufff8\010\ufff8\013\ufff8\014\ufff8\015" +
    "\ufff8\016\ufff8\001\002\000\010\003\ufffc\012\ufffc\022\ufffc" +
    "\001\002\000\016\006\ufffb\010\ufffb\013\ufffb\014\ufffb\015" +
    "\ufffb\016\ufffb\001\002\000\014\006\034\013\022\014\023" +
    "\015\021\016\024\001\002\000\016\006\ufff5\010\ufff5\013" +
    "\ufff5\014\ufff5\015\ufff5\016\ufff5\001\002\000\004\012\uffff" +
    "\001\002\000\004\002\000\001\002\000\004\002\001\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\035\000\004\002\003\001\001\000\002\001\001\000" +
    "\006\003\005\004\006\001\001\000\002\001\001\000\006" +
    "\003\034\004\006\001\001\000\002\001\001\000\004\004" +
    "\011\001\001\000\002\001\001\000\004\005\016\001\001" +
    "\000\002\001\001\000\004\005\032\001\001\000\004\005" +
    "\031\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\005\027\001\001\000\004\005\026\001\001\000\004\005" +
    "\025\001\001\000\004\005\024\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    Lexico s;
    public Sintactico(Lexico s) {
        super(s);
        this.s = s;
    }
    
    int nOp = 0;
    ArrayList<Instruction> flowExe = new ArrayList<>();
    public void syntax_error(Symbol s) {
        flowExe.add(new Instruction(new ErrorS(s.left,s.right,s.value)));
    }
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception {
        flowExe.add(new Instruction(new ErrorS(s.left,s.right,s.value,false)));
    }
    public ArrayList<String> getOperations() {
        return s.operations;
    }
    public String getInputs() {
        String ops = "OPERATIONS\n";
        if(s.operations.size() > 0) {
            for(int i = 0; i < s.operations.size(); i ++) {
                ops += s.operations.get(i) + "\n";
            }
        }
        else {
            ops += "No Operations\n";
        }
        return ops + "\n";
    }
    public void operationFinish(Double r) {
        flowExe.add(new Instruction(s.operations.get(nOp) + " = " + r));nOp += 1;
    }
    public String getExecution() {
        String exe = "";
        for(int i = 0; i < flowExe.size(); i ++) {
            exe += flowExe.get(i) + "\n";
        }
        return exe + "\n";
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintactico$actions {
  private final Sintactico parser;

  /** Constructor */
  CUP$Sintactico$actions(Sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action_part00000000(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= ini EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // ini ::= LK instructions RK 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // instructions ::= instruction instructions 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instructions",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // instructions ::= instruction 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instructions",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instructions ::= error instruction 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instructions",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instruction ::= RW_CALCULATE LKS expresion RKS SEMICOLON 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		RESULT = a;operationFinish(a);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instruction",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expresion ::= MINUS expresion 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = a *-1;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expresion ::= expresion PLUS expresion 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Double b = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = a + b;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expresion ::= expresion MINUS expresion 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Double b = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = a - b;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expresion ::= expresion MULT expresion 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Double b = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = a * b;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expresion ::= expresion DIV expresion 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Double b = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = a / b;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expresion ::= NUMBER 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = new Double(a);
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expresion ::= LPAR expresion RPAR 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = a;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
              return CUP$Sintactico$do_action_part00000000(
                               CUP$Sintactico$act_num,
                               CUP$Sintactico$parser,
                               CUP$Sintactico$stack,
                               CUP$Sintactico$top);
    }
}

}
