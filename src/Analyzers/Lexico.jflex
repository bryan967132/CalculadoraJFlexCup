/* 1. Package e importaciones */
package Analyzers;
import java_cup.runtime.Symbol;
import java.util.ArrayList;
import Components.*;

%%

/* 2. Configuraciones para el analisis (Operaciones y Declaraciones) */

%{
    ArrayList<Token> tokens = new ArrayList<>();
    ArrayList<ErrorL> errors = new ArrayList<>();
    ArrayList<String> operations = new ArrayList<>();
    String operation = "";
    public void printTokens() {
        System.out.println("TOKENS");
        System.out.printf("%-15s%-5s%-8s%-10s\n",
            "Lexeme",
            "Line",
            "Column",
            "Type"
	);
        tokens.forEach(
            token -> {
                token.print();
            }
        );
    }
    public void printErrors() {
        System.out.println("ERRORS");
        System.out.printf("%-5s%-8s%-10s\n",
            "Line",
            "Column",
            "Description"
	);
        errors.forEach(
            error -> {
                error.print();
            }
        );
    }
    public String getTokens() {
        String tokensTab = "TOKENS\n";
        tokensTab += "Lexeme         Line Column  Type\n";
        if(tokens.size() > 0) {
            for(int i = 0; i < tokens.size(); i ++) {
                tokensTab += tokens.get(i) + "\n";
            }
        }
        else tokensTab += "No Tokens\n";
        return tokensTab + "\n";
    }
    public String getErrors() {
        String errorsTab = "ERRORS\n";
        errorsTab += "Line Column  Description\n";
        if(errors.size() > 0) {
            for(int i = 0; i < errors.size(); i ++) {
                errorsTab += errors.get(i) + "\n";
            }
        }
        else errorsTab += "No Lexical Errors\n";
        return errorsTab + "\n";
    }
    void concat(String token) {
        operation += token;
    }
    void addOperation() {
        if(!operation.equals("")) {
            if(operation.charAt(0) == ' ') {
                operation = new StringBuilder(operation).deleteCharAt(0).toString();
            }
            operations.add(operation);
            operation = "";
        }
    }
%}

//Directivas
%class Lexico
%public
%cup
%char
%column
%full
%ignorecase
%line
%unicode

%init{
    yyline = 1;
    yychar = 1;
%init}

//Expresiones regulares
UNUSED=[ \r\t]+
DD=[0-9]+("."[0-9]+)?
ALPHA=[a-zA-Z]+

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

COMMENT = "//"{InputCharacter}*(LineTerminator)?

%%

/* 3. Reglas Semanticas */

"Calculate" {addOperation();tokens.add(new Token(yytext(),yyline,yychar,"RW_CALCULATE"));return new Symbol(sym.RW_CALCULATE,yyline,yychar,yytext());}
{ALPHA} {tokens.add(new Token(yytext(),yyline,yychar,"STRING"));return new Symbol(sym.STRING,yyline,yychar,yytext());}
{DD} {concat(yytext());tokens.add(new Token(yytext(),yyline,yychar,"NUMBER"));return new Symbol(sym.NUMBER,yyline,yychar,yytext());}
"+" {concat(" + ");tokens.add(new Token(yytext(),yyline,yychar,"PLUS"));return new Symbol(sym.PLUS,yyline,yychar,yytext());}
"-" {concat(" - ");tokens.add(new Token(yytext(),yyline,yychar,"MINUS"));return new Symbol(sym.MINUS,yyline,yychar,yytext());}
"*" {concat(" * ");tokens.add(new Token(yytext(),yyline,yychar,"MULT"));return new Symbol(sym.MULT,yyline,yychar,yytext());}
"/" {concat(" / ");tokens.add(new Token(yytext(),yyline,yychar,"DIV"));return new Symbol(sym.DIV,yyline,yychar,yytext());}
"(" {concat("(");tokens.add(new Token(yytext(),yyline,yychar,"LPAR"));return new Symbol(sym.LPAR,yyline,yychar,yytext());}
")" {concat(")");tokens.add(new Token(yytext(),yyline,yychar,"RPAR"));return new Symbol(sym.RPAR,yyline,yychar,yytext());}
"[" {tokens.add(new Token(yytext(),yyline,yychar,"LKS"));return new Symbol(sym.LKS,yyline,yychar,yytext());}
"]" {addOperation();tokens.add(new Token(yytext(),yyline,yychar,"RKS"));return new Symbol(sym.RKS,yyline,yychar,yytext());}
"{" {tokens.add(new Token(yytext(),yyline,yychar,"LK"));return new Symbol(sym.LK,yyline,yychar,yytext());}
"}" {addOperation();tokens.add(new Token(yytext(),yyline,yychar,"RK"));return new Symbol(sym.RK,yyline,yychar,yytext());}
";" {addOperation();tokens.add(new Token(yytext(),yyline,yychar,"SEMICOLON"));return new Symbol(sym.SEMICOLON,yyline,yychar,yytext());}
\n  {yychar = 1;}
{UNUSED} {}
{COMMENT} {}
. {errors.add(new ErrorL(yyline,yychar,yytext()));}