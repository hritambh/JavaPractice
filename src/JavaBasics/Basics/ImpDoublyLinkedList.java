package JavaBasics.Basics;

public class ImpDoublyLinkedList {
    Node head = null;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public ImpDoublyLinkedList(){
        this.head=null;
    }

    public void add(int data){
        Node newNode = new Node(data);

        if (head==null)
            head= newNode;
        else {
            Node temp =head;
            while(temp.next!=null){
                temp = temp.next;
            }
            newNode.prev = temp;
            temp.next = newNode;
        }
    }
    public static void main(String[] args) {
        ImpDoublyLinkedList dll1 = new ImpDoublyLinkedList();
        dll1.add(4);
        dll1.add(5);
        dll1.add(6);

        dll1.displayDoublyLinkedList();
    }

    private void displayDoublyLinkedList() {
        if (head!=null){
            Node temp = head;
            while (temp!=null){
                if ((temp.prev!=null) && (temp.next!=null))
                    System.out.println(temp.data+" with prev as "+ temp.prev.data+" with next as "+ temp.next.data);
                else
                    System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }
}
