package data.structures.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
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

    public static void main(String[] args ){
        Queue<String> queue = new LinkedList<>();
            queue.offer("Tommy Shelby");
            queue.offer("Arthur Shelby");
            queue.offer("John Shelby");

        System.out.println(queue);

        queue.poll();

        System.out.println(queue);

    }



}
