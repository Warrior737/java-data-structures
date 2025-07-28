package data.structures.linkedList.doubly;

public class Main {


    public static void main(String[] args) {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(1);
        myDoublyLinkedList.append(2);

        myDoublyLinkedList.prepend(333);

        myDoublyLinkedList.removeFirst();

        myDoublyLinkedList.insert(2, 555);

        myDoublyLinkedList.remove(2);

        myDoublyLinkedList.printDoublyLinkedList();



    }
}
