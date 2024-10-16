package JavaBasics.Basics;

// Implementation of Linked List

public class ImpLinkedList {
    Node head;
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public ImpLinkedList(){
        this.head=null;
    }

    public void add(int data){
        Node newNode = new Node(data);

        if (head==null)
            head=newNode;
        else {
            Node temp = head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printLL(){
        if (head!=null){
            Node temp =head;
            while (temp!=null){
                System.out.print(temp.data+ " ");
                temp= temp.next;
            }
        }
    }


    public static void main(String[] args) {
        ImpLinkedList ll =new ImpLinkedList();
        ll.add(23);
        ll.add(24);
        ll.add(25);
        ll.add(26);
        ll.add(27);
        ll.remove(25);
        ll.add(25);
        ll.printLL();
    }

    private void remove(int data) {
        if (head!=null){
            Node temp = head;
            while (temp.next.data != data){
                temp =temp.next;
            }
            temp.next = temp.next.next;
        }
    }

}
