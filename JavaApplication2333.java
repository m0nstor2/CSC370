/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2333;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author suraf
 */


public class JavaApplication2333 {
    public class Token {

    public String d;
    public String num;
    public Token left;
    public Token right;

    
    public String toString() {
        return d + " \"" + num + "\"";
    }

    public String paren() {
        if (left == null && right == null) {
            return num;
        } else {
            StringBuilder b = new StringBuilder();
            b.append("(");
            if (left != null) {
                b.append(left.paren()).append(" ");
            }
            b.append(num);
            if (right != null) {
                b.append(" ").append(right.paren());
            }
            b.append(")");
            return b.toString();
        }
    }

}
    
    private String text;
    private int i;

    public JavaApplication2333 init(String text) {
        i = 0;
        this.text = text;
        return this;
    }

    private boolean isEOT() {
        return text.length() <= i;
    }

    private char c() throws Exception {
        if (isEOT()) {
            throw new Exception("No more character");
        }
        return text.charAt(i);
    }

    private char next() throws Exception {
        char c = c();
        ++i;
        return c;
    }

    private void skipSpace() throws Exception {
        while (!isEOT() && Character.isWhitespace(c())) {
            next();
        }
    }

    private boolean isSignStart(char symbol) {
        return symbol == '+' || symbol == '=' || symbol == '*' || symbol == '/' || symbol == '-';
    }

    private boolean isDigitStart(char c) throws Exception {
        return Character.isDigit(c);
    }

    private boolean isVariableStart(char c) throws Exception {
        return Character.isAlphabetic(c);
    }

    private Token sign() throws Exception {
        Token t = new Token();
        t.d = "sign";
        t.num = Character.toString(next());
        return t;
    }

    private Token digit() throws Exception {
        StringBuilder b = new StringBuilder();
        b.append(next());
        
         b.append(next());
        
        Token t = new Token();
        t.d = "digit";
        t.num = b.toString();
        return t;
    }

    private Token variable() throws Exception {
        StringBuilder x = new StringBuilder();
        x.append(next());
       
        x.append(next());
        
        Token t = new Token();
        t.d = "variable";
        t.num = x.toString();
        return t;
    }

    public Token nextToken() throws Exception {
        skipSpace();
        if (isEOT()) {
            return null;
        } else if (isSignStart(c())) {
            return sign();
        } else if (isDigitStart(c())) {
            return digit();
        } else  
            return variable();
        
    }

    public List<Token> tokenize() throws Exception {
        List<Token> tokens = new ArrayList<>();
        Token t = nextToken();
        while (t != null) {
            tokens.add(t);
            t = nextToken();
        }
        return tokens;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String text = " t = 100 + 20 - 90 ";
        List<Token> list = new JavaApplication2333().init(text).tokenize();
        for (Token lex : list) {
            System.out.println(lex.toString());
        }
        
        
        
        
        // TODO code application logic here
    }
    
}
