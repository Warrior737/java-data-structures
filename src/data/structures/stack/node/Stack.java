package data.structures.stack.node;

public class Stack {

    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        Node (int value){
            this.value = value;
        }
    }

    public Stack (int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }


    public void push(int value){
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }


    public Node pop() {

        if(height ==0 ) return null;
         if(top == null) return null;

         Node temp = top;
         top = top.next;

         temp.next = null;
         height--;

         return temp;
    }



    public void printStack() {
        Node temp = top;

        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }
}
