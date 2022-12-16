public class Recursion {
    public static void main(String args[]) {
        System.out.println( capitalizeWord("my name is ahmad fareed rajpoot and i am a software engineer."));
    }

    // fibonacci sum
    public static int fibonacci(int n) {
        if (n < 0)  // only positive ints are allowed
            return -1;
        if (n == 1 || n == 0) // base case
            return n;
        return fibonacci(n-1) + fibonacci(n-2); // f(n) = f(n-1) + f(n-2)
    }

    // sum of digits of a positive integer
    public static int sumOfDigits(int n) {
        if (n == 0 || n < 0) // base case
            return 0;
        return n%10 + sumOfDigits(n/10);
    }

    // power of a number using recursion
    public static int powerOfNumber(int base, int exp) {
        if (exp < 0) // unintentional case - the constraint
            return -1;
        if (exp == 0) // base case - the stopping criterion
            return 1;
        return base * powerOfNumber(base, exp - 1); // recursive case - the flow
    }

    // find GCD of two number : the largest positive integer that divides the number without a remainder
    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) // -a, -b unintentional case
            return -1;
        if (b == 0) // base case gcd(a, 0) = a
            return a;
//        System.out.println("gcd(" + b + ", " + a + "%" + b + ")");
        return gcd(b, a % b);   //gcd(a, b) = gcd(b, a mod b)
    }

    // Decimal to Binary conversion
    public static int DecToBin(int n) {
        if (n == 0) // base case f(0) = 0
            return 0;
        return DecToBin(n/2) * 10 + n % 2; // f(n) = f(n/2) * 10 + n % 2
    }

    // reverse
    public static String reverse(String str) {
        if (str.isEmpty())
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    // palindrome
    public static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) // length 1 or 0 str is palindrome
            return true;
        if (str.charAt(0) == str.charAt(str.length() - 1)) // match first and last char
            return isPalindrome(str.substring(1, str.length() - 1));
        return false;
    }

    // first uppercase
    public static char firstUppercase(String str) {
        if (str.isEmpty())
            return ' ';
        if (Character.isUpperCase(str.charAt(0)))
            return str.charAt(0);
        else
            return firstUppercase(str.substring(1, str.length()));
    }

    // capitalize word
    public static String capitalizeWord(String str) {
        if (str.isEmpty())
            return str;

        char chr = str.charAt(str.length() - 1); // getting last char

        if(str.length() == 1)
            return Character.toString(Character.toUpperCase(chr)); // if one/first chr then capitalize it

        if(str.substring(str.length()-2, str.length()-1).equals(" ")) // if there is space before that char
            chr = Character.toUpperCase(chr);

        return capitalizeWord(str.substring(0,str.length() - 1)) + chr;
    }
}
