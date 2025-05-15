package Stack;

import java.util.Stack;

public class StackInbuildMethod {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(12);
        st.push(13);
        st.push(45);
        System.out.println(st);
        System.out.println(st.pop());
    }
}
