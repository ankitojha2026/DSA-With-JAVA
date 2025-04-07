public class CreateLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }

    }

    public static class linkList{
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

        // insert the value at any index
        void insertAt(int idx,int data)
        {
            Node temp1=new Node(data);
            Node temp=head;
            for(int i=0;i<idx-1;i++)
            {
                temp=temp.next;
            }
            Node aage=temp.next;
            temp.next=temp1;
            temp1.next=aage;



        }

        //        this method delete the element
        void delete(int value) {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }

            if (head.data == value) {
                head = head.next;
                return;
            }

            Node temp = head;
            Node prev = null;

            while (temp != null && temp.data != value) {
                prev = temp;
                temp = temp.next;
            }

            if (temp == null) {
                System.out.println("Value not found in the list.");
                return;
            }

            prev.next = temp.next;
        }

        //this method is used for deleting the first occurance from the linked list
        void deleteFirstOccurance(int key)
        {
            delete(key);
        }



    }


    public static void main(String[] args) {

        linkList ll=new linkList();
        ll.insetAtEnd(12);
        ll.insetAtEnd(13);
        ll.insetAtEnd(123);
        ll.insetAtEnd(67);
        ll.insetAtEnd(12);
        ll.display();

        ll.deleteFirstOccurance(13);
        ll.display();

    }
}
