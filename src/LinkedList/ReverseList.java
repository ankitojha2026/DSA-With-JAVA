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

        void reverse(Node head)
        {

         Node prev=null;
         Node current=head;
         while(current!=null)
         {
             Node next_node=current.next;

         }

        }




    }





        public static void main(String[] args) {

        Linkedlist l=new
                Linkedlist();
        l.addAtFirst(10);
        l.addAtFirst(20);
        l.addAtFirst(30);
        l.addAtFirst(40);
            System.out.println(l.head.data);
l.reverse(l.head);
    }
}
