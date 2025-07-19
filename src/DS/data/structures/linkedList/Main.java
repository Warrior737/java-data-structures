package DS.data.structures.linkedList;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){

        LinkedListDS linkedListDS = new LinkedListDS(2);

        linkedListDS.append(3);
        linkedListDS.printLinkedList();

        System.out.println("Remove last Operation");
        linkedListDS.removeLast();
        System.out.println("Linked List Length " + linkedListDS.getLength());

        System.out.println("Prepending Items");
        linkedListDS.prePendItem(1);

        System.out.println(" Delete First ");
        linkedListDS.removeFirst();
        linkedListDS.printLinkedList();

        System.out.println("Linked List Length " + linkedListDS.getLength());
        linkedListDS.prePendItem(1);

        System.out.println("Adding Items ");
        linkedListDS.append(3);
        linkedListDS.append(4);

        System.out.println("Linked List Length " + linkedListDS.getLength());
        linkedListDS.printLinkedList();

       LinkedListDS.Node node = linkedListDS.getElementByIndex(2);
        System.out.println("Element at Index 2 :" + node.value   );


        linkedListDS.setElementAtIndex(0, 4);
        System.out.println("New element at index 0 is: "   );
        linkedListDS.printLinkedList();

        System.out.println( " Insert New Element at Index " );
        linkedListDS.insertNodeAtIndex(0 , 1);
        linkedListDS.insertNodeAtIndex(5 , 5);
        linkedListDS.printLinkedList();


        System.out.println("Remove Element at Index");
        linkedListDS.deleteAtIndex(1);
        linkedListDS.printLinkedList();

        System.out.println("Reverse Linked List");
        linkedListDS.reverseLinkedList();
        linkedListDS.printLinkedList();

    }

}
