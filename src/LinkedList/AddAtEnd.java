package LinkedList;

public class AddAtEnd {

    public  static class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static class Linkedlist{
        Node head=null;
        Node tail=null;

        void addAtEnd(int data)
        {
            Node newNode= new Node(data);
            if(head==null)
            {
                head=newNode;
                tail =newNode;
            }
            else
            {
                tail.next=newNode;
                tail=newNode;
            }
        }

        void print()
        {
            Node temp=head;
            while (temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

    }



    public static void main(String[] args) {

        Linkedlist l =new Linkedlist();
        l.addAtEnd(10);
        l.addAtEnd(20);
        l.addAtEnd(30);
        l.print();


    }
}
