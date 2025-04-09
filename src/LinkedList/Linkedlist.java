package LinkedList;

public class Linkedlist {
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
        void insertAtHead(int data)
        {
            Node temp=new Node(data);
            if(head==null)
            {
                head=temp;
                tail=temp;
            }
            else
            {
                temp.next=head;
                head=temp;

            }

        }


}
