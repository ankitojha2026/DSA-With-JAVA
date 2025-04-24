package LinkedList;

public class ReverseAPartOfList {


    Node head;
    int size;

    Node tail;
    ReverseAPartOfList()
    {
        head=null;
        tail=null;
    }
    void addAtHead(int data)
    {
        Node newData=new Node(data);
        if(head==null)
        {
            head=newData;
            tail=newData;
        }
        else {
            newData.next = head;
            head = newData;
        }
    }

    void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void addAtEnd(int data)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            size++;
            head=newNode;
            tail=newNode;
        }
        else {
            size++;
            tail.next=newNode;
            tail=newNode;
        }

    }

    void revreseAt(int data)
    {
    }




    public static void main(String[] args) {
ReverseAPartOfList l=new ReverseAPartOfList();
        l.addAtEnd(1);
        l.addAtEnd(2);
        l.addAtEnd(3);
        l.addAtEnd(4);
        l.addAtEnd(5);
        l.addAtEnd(6);
        l.print();

    }
}
