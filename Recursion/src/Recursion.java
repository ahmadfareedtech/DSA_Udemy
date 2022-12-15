public class Recursion {
    public static void main(String args[]) {
        System.out.println( DecToBin(10));
    }

    // fibonacci sum
    public static int fibonacci(int n) {
        if (n < 0) return -1; // only positive ints are allowed
        if (n == 1 || n == 0) return n; // base case
        return fibonacci(n-1) + fibonacci(n-2); // f(n) = f(n-1) + f(n-2)
    }

    // sum of digits of a positive integer
    public static int sumOfDigits(int n) {
        if (n == 0 || n < 0) return 0; // base case
        return n%10 + sumOfDigits(n/10);
    }

    // power of a number using recursion
    public static int powerOfNumber(int base, int exp) {
        if (exp < 0) return -1; // unintentional case - the constraint
        if (exp == 0) return 1; // base case - the stopping criterion
        return base * powerOfNumber(base, exp - 1); // recursive case - the flow
    }

    // find GCD of two number : the largest positive integer that divides the number without a remainder
    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) return -1;  // -a, -b unintentional case
        if (b == 0) return a; // base case gcd(a, 0) = a
//        System.out.println("gcd(" + b + ", " + a + "%" + b + ")");
        return gcd(b, a % b);   //gcd(a, b) = gcd(b, a mod b)
    }
    // Decimal to Binary conversion
    public static int DecToBin(int n) {
        if(n == 0) return 0; // base case f(0) = 0
        return DecToBin(n/2) * 10 + n % 2; // f(n) = f(n/2) * 10 + n % 2
    }
}
