package data.structures.queue.node;

public class Main {
    /*******************************************************************************************************************

     Basic Info: -> Java Queue follows the principle of FIFO "First In - First Out"
     A Collection designed to hold elements prior to processing ( first in first serve ).

     Features of Queue:
     - FIFO = First In - First Out

     Analogy:  like in the supermarket when going to pay!

     Concepts:
     - Add =  enqueue, offer()
     - Remove = dequeue, poll()


     ********************************************************************************************************************/


    public static void main(String[] args) {
            Queue myQueue = new Queue(1);

            myQueue.enqueue(2);
            myQueue.enqueue(3);

            myQueue.dequeue();
            myQueue.dequeue();
            myQueue.dequeue();
            myQueue.printQueue();


    }



}
