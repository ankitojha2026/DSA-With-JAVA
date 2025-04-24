package LinkedList;

public class MergeTwoList {


    public static  class linkedlist{
        Node head;
        Node tail;
        linkedlist()
        {
            this.head=null;
            this .tail=null;
        }

        void addAtFirst(int data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                tail=newNode;
            }
            else
            {
                newNode.next=head;
                head=newNode;
            }
        }

        void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        void mergeTwoList(linkedlist l1 , linkedlist l2)
        {
            Node temp=l1.head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }

            temp.next=l2.head;

        }



    }


    public static void main(String[] args) {
        linkedlist l=new linkedlist();
        linkedlist ll=new linkedlist();

        l.addAtFirst(12);
        l.addAtFirst(13);
        l.addAtFirst(14);

        l.addAtFirst(14);
        l.addAtFirst(15);
        l.addAtFirst(16);


        ll.addAtFirst(1);
        ll.addAtFirst(2);
        ll.addAtFirst(3);

        ll.addAtFirst(4);
        ll.addAtFirst(5);
        ll.addAtFirst(6);

        l.display();
        ll.display();
        l.mergeTwoList(l,ll);
        l.display();
    }
}
