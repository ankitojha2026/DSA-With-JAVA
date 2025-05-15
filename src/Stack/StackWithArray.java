package Stack;

// lifo , filo
public class StackWithArray {
    int ptr=-1;
    int arr[];

    StackWithArray(int capacity)
    {
        arr =new int[capacity];
    }

    void push(int num) throws Error
    {

        if(arr.length == ptr){
            throw new Error("Stack OverFlow");

        }
        else {

            ptr++;
            arr[ptr] = num;
        }
    }

    int pop() throws Error
    {
        if(ptr==-1)
            throw new Error("Stack Is Empty");

        return arr[ptr--];
    }

    void display()
    {
        System.out.print("[");
        for(int i=0;i<=ptr;i++)
        {
            System.out.print( arr[i]+" , ");
        }
        System.out.println("]");
    }

    int peek()
    {
        return arr[ptr];
    }
    public static void main(String[] args) {

        StackWithArray st =new StackWithArray(20);
        st.push(12);
        st.push(13);
        st.push(90);
        st.push(60);
        st.pop();
        st.display();


    }
}
