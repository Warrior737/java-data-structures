package data.structures.stack;

import java.util.Stack;

public class StackInterface {
    /*******************************************************************************************************************

     Basic Info: -> Java Stack Class Represents a LIFO stack of Objects ( LAST IN - FIRST OUT )  - It's a synchronized implementation.

     Features of Stack:
     - LIFO: Last in First Out
     - Linear: Elements are Arranged in sequential order

     Analogy: Stack of Plates, every new plate it's added on top, and then removing plates we always start with the top one


     ********************************************************************************************************************/

    public static void main(String[] args){

        stackImplementationIntJava();
        stackImplementationStringJava();
    }

    public static void stackImplementationIntJava() {
        Stack<Integer> intStack = new Stack<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);

        while(!intStack.isEmpty()){
            System.out.println(intStack.pop());
        }
    }

    public static void stackImplementationStringJava() {
        Stack<String> stringStack = new Stack<>();

        stringStack.push("God of War");
        stringStack.push("Need for Speed");
        stringStack.push("Call of Duty");

        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }
    }



}
