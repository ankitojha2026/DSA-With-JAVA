package LinkedList;

public class ZigZag {

   public static void swap(Node p1 , Node p2 )
    {
        Node temp=p2;
        p2.next= p1;
        p1.next=temp;
    }
    public static void zigZag(Node head)
    {
//        int i=1;
//        swap(head , head.next);
//
//        while(head.next.next!=null)
//        {
//            if(i%2!=0)
//            {
//               if (head.data>head.next.data ) {
//                   swap(head.next , head, head.next.next);
//                   head = head.next;
//                   i++;
//               }
//               else {
//                   head=head.next;
//                   i++;
//               }
//            }
//            else {
//                if(head.data<head.next.data)
//                {
//                    swap(head,head.next,head.next.next);
//                    head=head.next;
//                    i++;
//                }
//                else {
//                    head=head.next;
//                    i++;
//                }
//            }
//        }

swap(head,head.next);

    }

    public static void print(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        Node f=new Node(7);
        Node g=new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        print(a);
        zigZag(a);
        print(a);


    }
}
