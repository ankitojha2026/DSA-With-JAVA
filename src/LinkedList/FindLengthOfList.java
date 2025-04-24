package LinkedList;

public class FindLengthOfList {

   Node head;
   Node tail;

   FindLengthOfList()
   {
       head=null;
       tail=null;
   }

   void addAtEnd(int data)
   {
       Node newNode=new Node(data);
       if(head==null) {
           head = newNode;
           tail = newNode;
       }
       else
       {
           tail.next=newNode;
           tail=newNode;
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



    public static void main(String[] args) {
        FindLengthOfList l=new FindLengthOfList();
        l.addAtEnd(12);
        l.addAtEnd(13);
        l.addAtEnd(14);
        l.addAtEnd(15);
        l.addAtEnd(16);
        l.display();
        System.out.println(l.size());
    }
}
