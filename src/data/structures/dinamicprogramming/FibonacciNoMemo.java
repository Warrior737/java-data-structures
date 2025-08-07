package data.structures.dinamicprogramming;

public class FibonacciNoMemo {

    static int counter = 0;

    public static int fib(int n){
        counter++;
        if(n ==0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }


    public static void main(String[] args) {
        int n= 40;

        System.out.println("Fibonacci of " + n + " = "  + fib(n) );

        System.out.println("Counter: " + counter);
    }
}
