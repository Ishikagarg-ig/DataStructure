import java.util.*;
import java.io.*;
class CQStack {
    private int maxsize, top;
    private int[] arr;

    public CQStack(int size) {
        maxsize = size;
        top = -1;
        arr = new int[maxsize];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxsize - 1);
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Overflow");
        } else {
            arr[++top] = element;
        }
    }

    public int peek(){
        return arr[top];
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        } else {
            int temp = arr[top--];
            return temp;
        }
    }

    static boolean isOperand(char ch){
        return (ch>='a' && ch<='z')||(ch>='A' && ch<='Z') || (Character.isDigit(ch));
    }

    static int checkprecedence(char ch){
        switch (ch){
            case '+':
            case '-':return 1;
            case '*':
            case '/':return 2;
            case '^':return 3;
        }
        return -1;
    }

    static String evaluatePostfix(CQStack st, String str) {
        String output=new String();
        for (int i = 0; i <str.length(); i++) {
            if (isOperand(str.charAt(i))) {
                output+=str.charAt(i);
            }
            else if(str.charAt(i)=='('){
                 st.push(str.charAt(i));
            }
            else if(str.charAt(i)==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    output+=(char)st.pop();
                }
                if(!st.isEmpty() && st.peek()!='('){
                    return "invalid expression";
                }
                else{
                    st.pop();
                }
            }
            else{
                while(!st.isEmpty() && checkprecedence(str.charAt(i))<=checkprecedence((char)st.peek())){
                    output+=(char)st.pop();
                }
                st.push(str.charAt(i));
            }
        }
        while(!st.isEmpty())
            output+=(char)st.pop();
        return output;
    }

    public static void main(String[] args) {
        CQStack st = new CQStack(10);
        String str = "6/(3^2)-8";
        System.out.println("Answer = " + evaluatePostfix(st, str));
    }
}