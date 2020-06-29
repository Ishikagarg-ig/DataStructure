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

    public int pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        } else {
            int temp = arr[top--];
            return temp;
        }
    }


        static int evaluatePostfix(CQStack st, String str) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    st.push(str.charAt(i) - '0');
                } else {
                    int a = st.pop();
                    int b = st.pop();
                    switch (str.charAt(i)) {
                        case '+':
                            st.push(b + a);
                            break;
                        case '-':
                            st.push(b - a);
                            break;
                        case '*':
                            st.push(b * a);
                            break;
                        case '/':
                            st.push(b / a);
                            break;
                    }
                }
            }
            int answer = st.pop();
            return answer;
        }

        public static void main(String[] args) {
            CQStack st = new CQStack(20);
            String str = "632+7*+";
            System.out.println("Answer = " + evaluatePostfix(st, str));
        }
    }