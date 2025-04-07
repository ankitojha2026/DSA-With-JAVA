package LinkedList;

public class AddAtFirst {

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

            void addAtFirst(int data)
            {
                Node newNode= new Node(data);
                if(head==null)
                {
                    head=newNode;
                    tail =newNode;
                }
                else
                {
                    head.next=newNode;
                    head=newNode;
                }
            }

            void print()
            {  Node temp=head;
                while (temp!=null)
                {
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }
            }

        }



        public static void main(String[] args) {

            Linkedlist l =new Linkedlist();
            l.addAtFirst(10);
            l.addAtFirst(20);
            l.print();




        }
    }





