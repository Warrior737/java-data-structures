package data.structures.dinamicprogramming;

public class FibonacciBottomUp {

    // Big O notation O(n)

    static int counter = 0;


    public static int fib(int n) {
        int[] fibList = new int[n +1];
        fibList[0] = 0;
        fibList[1] = 1;

        for (int index = 2; index <= n; index ++){
            fibList[index] = fibList[index -1] + fibList[index -2];
            counter++;
        }
        return fibList[n];
    }

    public static void main(String[] args) {
        int n= 40;

        System.out.println("Fibonacci of " + n + " = "  + fib(n) );
        System.out.println("Counter: " + counter);
    }


}
