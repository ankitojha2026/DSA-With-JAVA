package LinkedList;

public class ReverseBetweenMN {



    Node head;
    int size;

    Node tail;
    ReverseBetweenMN()
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

    void revreseMN(int M , int N)
    {

        Node MNode=head;
        Node NNode=head;



        while(NNode.data!=N)
        {
            NNode=NNode.next;
        }
        NNode=NNode.next;


        while(MNode.next.data!=M)
        {
            MNode=MNode.next;
        }

        Node temp=MNode.next;


//        System.out.println(head.data);
//        System.out.println(MNode.data);
//        System.out.println(NNode.data);



        Node prev=null;
        Node current=temp;
        while(current!=null && current.data!=N )
        {
            Node next_node= current.next;
            current.next=prev;
            prev=current;
            current=next_node;
            temp=prev;

        }

        while(temp!=null)
        {
            System.out.println(temp.data);
        }


    }



    public static void main(String[] args) {

        ReverseBetweenMN l=new ReverseBetweenMN();
        l.addAtEnd(1);
        l.addAtEnd(2);
        l.addAtEnd(3);
        l.addAtEnd(4);
        l.addAtEnd(5);
        l.print();
        l.revreseMN(2,4);
        l.print();
    }
}
