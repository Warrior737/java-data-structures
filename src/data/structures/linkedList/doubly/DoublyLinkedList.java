package data.structures.linkedList.doubly;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList (int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    class Node {
        int value;
        Node next;
        Node prev;

        public Node (int value) {
            this.value = value;
        }
    }


    public void printDoublyLinkedList () {
        Node temp = head;

        while(temp != null ) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0 ){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }



    // Hard to read
    public Node removeLast() {

        if ( length == 0  ) return null;

        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        length--;

        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp ;

    }
    public Node removeLastV2() {

        if ( length == 0  ) return null;
        Node temp = tail;
        if(length == 1) {
            head = null;
            tail = null;
        }else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp ;

    }

}
