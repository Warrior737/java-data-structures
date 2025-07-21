package data.structures.stack.node;

public class Main {
    /*******************************************************************************************************************

     Basic Info: -> Java Stack Class Represents a LIFO stack of Objects ( LAST IN - FIRST OUT )  - It's a synchronized implementation.

     Features of Stack:
     - LIFO: Last in First Out
     - Linear: Elements are Arranged in sequential order

     Analogy: Stack of Plates, every new plate it's added on top, and then removing plates we always start with the top one


     ********************************************************************************************************************/

    public static void main(String[] args) {
        Stack myStack = new Stack(1);

        myStack.push(2);
        myStack.push(3);

        myStack.pop();

        myStack.printStack();


    }
}
