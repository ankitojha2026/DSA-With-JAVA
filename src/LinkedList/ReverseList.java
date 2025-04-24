package LinkedList;

public class ReverseList {


    public  static class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static class Linkedlist {
        Node head = null;
        Node tail = null;

        void addAtFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                newNode.next = head;
                head = newNode;
                tail=newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }


        void InsertAtEnd(int data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }

        }

        void divide()
        {
            Node temp=head;
            head=null;


            while(temp!=null) {
                Node x=temp;
                temp=temp.next;
                x.next=null;
                addAtFirst(x.data);

            }
        }


        void reverse()
        {
            Node prev=null;
            Node current=head;
            while(current!=null)
            {
               Node next_node= current.next;
               current.next=prev;
               prev=current;
               current=next_node;
               head=prev;

            }
        }



    } public static void main(String[] args) {

        Linkedlist l=new Linkedlist();
        l.InsertAtEnd(12);
        l.InsertAtEnd(13);
        l.InsertAtEnd(14);
        l.InsertAtEnd(15);
        l.print();
        System.out.println();
        l.reverse();
        l.print();
    }
}
