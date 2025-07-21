package data.structures.linkedList.singly;

public class LinkedListDS {

    Node head;
    Node tail;
    int length;

    class Node {
        int value;
        Node next;

        public Node (int value){
            this.value = value;
        }
    }

    public LinkedListDS (int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }

    public void printLinkedList() {
        Node item = head;
        while (item != null){
            System.out.println(item.value);
            item = item.next;
        }
    }

    public void append(int value) {
       Node newNode = new Node(value);

        if ( length == 0 ){
            head = newNode;
            tail = newNode;
            length++;
        } else {
            tail.next = newNode;
            tail = newNode;
            length++;
        }

    }

    public Node removeLast() {
        if(length == 0 ) return null;

        Node node = head;
        Node previous = head;

        while(node.next != null) {
            previous = node;
            node = node.next;
        }
        tail= previous;
        tail.next = null;
        length--;
        if (length == 0){
            head = null;
            tail = null;
        }

        return tail;
    }

    // PrePend Means Add First
    public void prePendItem(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
            length++;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public Node removeFirst() {

        if( length == 0) return null;

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if (length == 0){
            tail =null;
        }
        return temp;
    }



    public Node getElementByIndex(int index){
        //Edge Case always check
        if(index < 0 || index > length) return null;

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public boolean setElementAtIndex(int index, int value){
        Node temp = getElementByIndex(index);

        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }


    public boolean insertNodeAtIndex(int index, int value ){

        if (index < 0 || index > length) return false;

        if (index == 0){
            prePendItem(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = getElementByIndex(index - 1);

        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node deleteAtIndex(int index) {
        if (index < 0 || index > length) return null;

        if (index == 0 ) return removeFirst();

        if( index == length -1 ) return removeLast();

        Node previous = getElementByIndex(index -1);

        Node temp = previous.next;

        previous.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }


    public void reverseLinkedList(){
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public int getLength() {
        return length;
    }
}
