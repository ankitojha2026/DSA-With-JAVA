package LinkedList;

public class kthRotation {
        public static class Linkedlist {
            Node head = null;
            Node tail = null;

            void addAtFirst(int data) {
                Node newNode = new Node(data);
                if (head == null) {
                    newNode.next = head;
                    head = newNode;
                    tail = newNode;
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
                System.out.println();
            }


            void InsertAtEnd(int data) {
                Node newNode = new Node(data);
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }

            }

            void reverse() {
                Node prev = null;
                Node current = head;
                while (current != null) {
                    Node next_node = current.next;
                    current.next = prev;
                    prev = current;
                    current = next_node;
                    head = prev;

                }
            }


            int size()
            {
                int count=0;
                Node temp=head;
                while(temp!=null)
                {
                    count++;
                    temp=temp.next;
                }
                return count;
            }

            void reversekth(int k)
            {

                k=k%size();
                int newHead= size()-k;
                Node current=head;

                Node tail=head;
                Node prev=head;

                while (tail.next!=null)
                {
                    tail=tail.next;
                }

                for(int i=1;i<newHead;i++)
                {
                    current=current.next;
                    prev=prev.next;
                }
                tail.next=head;

                head=current.next;
                prev.next=null;

            }



        }


    public static void main(String[] args) {
        Linkedlist l=new Linkedlist();
        l.InsertAtEnd(1);
        l.InsertAtEnd(2);
        l.InsertAtEnd(3);
        l.InsertAtEnd(4);
        l.InsertAtEnd(5);
        l.InsertAtEnd(6);
        l.InsertAtEnd(7);
        l.InsertAtEnd(8);
        l.InsertAtEnd(9);
        l.InsertAtEnd(10);
        l.print();
        l.reversekth(3);
        l.print();
    }
}
