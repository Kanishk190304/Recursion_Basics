public class PowerFunction {
    
    public static void main(String[] args) {
        int x = 2;
        int n = -2;
        System.out.println(findPower(x, n));
    }

    public static double findPower(int x, int n){
        if(n == 0){
            return 1; // base case : x^0 = 1
        }
        if(n > 0){
            return (double) x * findPower(x, n-1); // positive power
        }
        else{
            return 1 / findPower(x, -n); // negative power
        }
    }
}
