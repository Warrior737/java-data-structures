package data.structures.recursion;

public class Factorial {

    public static void main(String[] args) {
        int myFact = factorial(4);

        System.out.println(myFact);
    }

    private static int factorial(int n) {
        if(n ==1) return 1;
        return n * factorial( n -1);
    }
}
