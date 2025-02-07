import java.util.*;

public class FibonacciWithDP {

    static int nthFibonacciUtil(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }

        if (memo[n] != -1) {
            return memo[n];
        }


        memo[n] = nthFibonacciUtil(n - 1, memo) + nthFibonacciUtil(n - 2, memo);

        System.out.println("Updated memo: " + Arrays.toString(memo));
        return memo[n];
    }

    static int nthFibonacci(int n) {
        memo = new int[n + 1];
        Arrays.fill(memo, -1);

        return nthFibonacciUtil(n, memo);
    }

    static int[] memo;

    public static void main(String[] args) throws Exception {

        int n = 5;
        int result = nthFibonacci(n);
        System.out.println(result);
        // System.out.println(Arrays.toString(memo));s
    }
}
