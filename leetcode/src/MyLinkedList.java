public class MyLinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public MyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            System.out.println(temp.next);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public Node get(int x){
        if(x < length || x < 0){
            return null;
        }

        Node curr = head;
        for(int i = 0; i < x; i++){
            curr = curr.next;
        }

        return curr;
    }

    public void reverseBetween(int m, int n){
        Node current = head;
        Node previous = null;

        while(current != null){
           Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
    }


    public void reverseList() {
        if(head == null || head.next == null){
            return;
        }

        Node curr = head;
        Node prev = null;

        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }

        head = prev; //head must be updated
    }

}