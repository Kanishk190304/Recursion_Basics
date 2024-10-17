public class PrimeNumber {
    
    public static void main(String[] args) {
        int n = 17;
        System.out.println(isPrime(n, 2));
    }

    public static boolean isPrime(int n, int i){
        if(i > n/2){
            return true; //base case
        }
        if(n % i == 0){
            return false;
        }
        return isPrime(n, i+1); //recursive call
    }
}
