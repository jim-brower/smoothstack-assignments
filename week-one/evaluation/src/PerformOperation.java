import java.io.*;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // My code starts here

    /*
        returns a self explanatory lambda
     */
    public static PerformOperation isOdd() {
        return (num) -> num % 2 != 0;
    }

    /*
        returns a lambda that first checks some conditions,
        then does num % with every odd number up to sqrt(num),
        which is the last number that could be a factor of any
        given number.
     */
    public static PerformOperation isPrime() {
        return (num) -> {
            if (num < 2) { return false; }
            if (num == 2)  { return true; }
            if (num % 2 == 0) { return false; }
            if (num < 9) { return true; }

            int max = (int) Math.sqrt(num);
            for (int i = 3; i <= max; i+=2) {
                if (num % i == 0) { return false; };
            }
            return true;
        };
    }

    /*
        returns a lambda that converts the integer into a string, creates
        a reverse of the string and compares the two.
     */
    public static PerformOperation isPalindrome() {
        return (num) -> {
            String number = Integer.toString(num);
            String reversed = new StringBuilder(number).reverse().toString();
            return number.equals(reversed);
        };
    }
}

    // All this code is provided for the question.
    class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            PerformOperation op;
            boolean ret;
            String ans = null;
            while (T--> 0) {
                String s = br.readLine().trim();
                StringTokenizer st = new StringTokenizer(s);
                int ch = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                if (ch == 1) {
                    op = MyMath.isOdd();
                    ret = MyMath.checker(op, num);
                    ans = (ret) ? "ODD" : "EVEN";
                } else if (ch == 2) {
                    op = MyMath.isPrime();
                    ret = MyMath.checker(op, num);
                    ans = (ret) ? "PRIME" : "COMPOSITE";
                } else if (ch == 3) {
                    op = MyMath.isPalindrome();
                    ret = MyMath.checker(op, num);
                    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

                }
                System.out.println(ans);
            }
        }
    }