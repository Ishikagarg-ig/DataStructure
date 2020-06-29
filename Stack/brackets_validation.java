import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)=='}' || s.charAt(i)==']' || s.charAt(i)==')'){
                if(!st.isEmpty()){
                    if(s.charAt(i)=='}' && st.peek()=='{'){
                        st.pop();
                    }
                    else if(s.charAt(i)==')' && st.peek()=='('){
                        st.pop();
                    }
                    else if(s.charAt(i)==']' && st.peek()=='['){
                        st.pop();
                    }     
                    else{
                        st.push(s.charAt(i));
                    }
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        if(st.size()>0){
            return "NO";
        }
        return "YES";
    }

    private static final Scanner ss = new Scanner(System.in);

    public static void main(String[] args) {
        int t=ss.nextInt();
        for(int i=0;i<t;i++){
            String s=ss.next();
            String str=isBalanced(s);
            System.out.println(str);
        }
    }
}
