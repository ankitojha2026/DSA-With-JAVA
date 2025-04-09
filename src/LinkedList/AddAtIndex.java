package LinkedList;

public class AddAtIndex {

    Node head=null;
    Node tail=null;
    //inset data
    void insetAtEnd(int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
            tail=temp;
        }
        else {

            tail.next = temp;
            tail = temp;
        }

    }

    //display
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println();
    }

    //finding size
    int size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }


    //insetAt the head
    void insertAtHead(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;

        }
    }






//    insert at
        void insertAt(int idx , int data) throws Error
    {
        if(head==null){
            throw new Error("List is Empty");
        }
        if(idx>size()){throw new Error("Index out Of Bound");}
        else
        {

            Node newNode=new Node(data);
            Node temp=head;

            for(int i=0;i<idx-1;i++)
            {
                temp=temp.next;
            }

            newNode.next=temp.next;
           temp.next=newNode;
        }

    }



    public static void main(String []args)
    {

        AddAtIndex l =new AddAtIndex();
        l.insertAtHead(12);
        l.insertAtHead(14);
        l.insertAtHead(15);
        l.insertAtHead(16);
        l.insertAt(2,30);
        l.insertAt(1,34);
        l.display();



    }
}
