package LinkedList;

public class RemoveDublicate {

    Node head;
    int size;

    Node tail;
    RemoveDublicate()
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


    void removeDuplicate()
    {
        Node p1=head;
        while(p1!=null && p1.next!=null)
        {
            Node p2=p1;
            while(p2.next!=null)
            {
                if(p1.data==p2.next.data)
                {
                    p2.next=p2.next.next;
                }
                else
                {
                    p2=p2.next;
                }
            }

            p1=p1.next;
        }
    }




    public static void main(String[] args) {

        RemoveDublicate l=new RemoveDublicate();
        l.addAtEnd(1);
        l.addAtEnd(3);
        l.addAtEnd(3);
        l.addAtEnd(6);
        l.addAtEnd(1);
        l.addAtEnd(4);
        l.addAtEnd(34);
        l.addAtEnd(34);

        l.removeDuplicate();
        l.print();



    }
}
