package LinkedList;

public class RemoveCycles {


   public static void print(Node head)
   {
       while(head!=null)
       {
           System.out.print(head.data+" ");
           head=head.next;
       }
       System.out.println();
   }


   public static Node removeCycle(Node head)
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null)
        {

            slow=slow.next;
            fast =fast.next.next;

            if(slow==fast)
            {
                break;
            }
        }

        slow =head;
        while(fast!=slow)
        {
            fast=fast.next;
            slow=slow.next;
        }

        System.out.println("start of loop:"+ fast.data);

        while(fast.next!=slow)
        {
            fast=fast.next;
        }

        System.out.println("End of loop:"+ fast.data);
        fast.next=null;

        return head;

    }










    public static void main(String[] args) {


        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=d;

        print(removeCycle(a));














    }
}
