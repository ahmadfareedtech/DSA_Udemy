public class Recursion {
    public static void main(String args[]) {
        System.out.println( sumOfDigits(333));
    }

    public static int fibonacci(int n) {
        if(n < 0) return -1; // only positive ints are allowed
        if(n == 1 || n == 0) { // base case
            return n;
        }
        // f(n) = f(n-1) + f(n-2)
        return fibonacci(n-1) + fibonacci(n-2);
    }

    // sum of digits of a positive integer
    public static int sumOfDigits(int n) {
        if(n == 0 || n < 0) return 0; // base case
        return n%10 + sumOfDigits(n/10);
    }
}
