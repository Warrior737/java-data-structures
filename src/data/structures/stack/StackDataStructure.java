package data.structures.stack;

import java.util.List;
import java.util.Stack;

public class StackDataStructure {
    /*******************************************************************************************************************

     Basic Info: -> Java Stack Class Represents a LIFO stack of Objects ( LAST IN - FIRST OUT )  - It's a synchronized implementation.

     Features of Stack:
     - LIFO: Last in First Out
     - Linear: Elements are Arranged in sequential order

     Analogy: Stack of Plates, every new plate it's added on top, and then removing plates we always start with the top one


     ********************************************************************************************************************/

    public static void main(String[] args){
        stackImplementationJava();
    }

    public static void stackImplementationJava() {
        Stack<Integer> intStack = new Stack<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);

        while(!intStack.isEmpty()){
            System.out.println(intStack.pop());
        }
    }
}
