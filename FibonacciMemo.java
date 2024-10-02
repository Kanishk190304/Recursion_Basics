public class FibonacciMemo {

    public static void main(String[] args) {
        int n = 5; // i.e. 5th fibonacci term
        int[] memo = new int[n+1]; // To store values
        System.out.println(fibo(n, memo));
    }

    public static int fibo(int n, int[] memo){
        if(n <= 1){
            return n; // base case
        }
        if(memo[n] != 0){ // already calculated
            return memo[n];
        }
        memo[n] = fibo(n-1, memo) + fibo(n-2, memo); // recursive calls
        return memo[n];
    }
}
