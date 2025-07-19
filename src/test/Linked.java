package test;

public class Linked {
    Node head;
    Node tail;
    int length = 0 ;

    Linked(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }

    class Node {
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length ==0){
            head = newNode;
            tail = newNode;
            length++;
        } else {
            tail.next = newNode;
            tail = newNode;
            length++;
        }
    }

    public void printList() {
        Node item = head;
        while (item != null) {
            System.out.println("Node Item: " + item.value);
            item = item.next;
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

    public Node removeFirst() {
        if (length == 0) return null;

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if(length == 0){
            tail= null;
        }
        return temp;
    }

    public void prePendItem(int value){
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }

    public Node getNodeAt(int index){
        if(index < 0 || index >= length) return null;

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = getNodeAt(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index < 0 || index > length) return false;

        if(index==0){
            prePendItem(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = getNodeAt(index -1);

        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }


    public Node remove (int index){

        if (index < 0 || index >= length ) return null;
        if(index == 0) return removeFirst();
        if(index == length -1 ) return removeLast();

        Node prev = getNodeAt(index -1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;

        length--;

        return temp;
    }

    public void reverse() {
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
}
