package data.structures.heap;

public class Main {

    public static void main(String[] args) {
        Heap myHeap = new Heap();
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);

        System.out.println(myHeap.getHeap());

        myHeap.insert(100);
        System.out.println(myHeap.getHeap());

        myHeap.insert(75);
        System.out.println(myHeap.getHeap());

        /*
        Expected output
        [99, 72, 61, 58]
        [100, 99, 61, 58, 72]
        [100, 99, 75, 58, 72, 61]
         */

        System.out.println("******* Next Example *********");

        Heap heapRemove = new Heap();

        heapRemove.insert(95);
        heapRemove.insert(75);
        heapRemove.insert(80);
        heapRemove.insert(55);
        heapRemove.insert(60);
        heapRemove.insert(50);
        heapRemove.insert(65);

        System.out.println(heapRemove.getHeap());

        heapRemove.remove();
        System.out.println(heapRemove.getHeap());

        heapRemove.remove();
        System.out.println(heapRemove.getHeap());

        /*  Expected Output
        [95, 75, 80, 55, 60, 50, 65]
        [80, 75, 65, 55, 60, 50]
        [75, 60, 65, 55, 50]
         */

    }
}
