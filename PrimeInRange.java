public class PrimeInRange {
    
    public static void main(String[] args) {
        int n = 100;
        for(int j = 2; j<=n; j++){
            if(isPrime(j, 2) == true){
                System.out.print(j + " ");
            }
        }
    }

    public static boolean isPrime(int n, int i){
        if(i > n/2){
            return true;
        }
        if(n % i == 0){
            return false;
        }
        return isPrime(n, i+1);
    }
}
