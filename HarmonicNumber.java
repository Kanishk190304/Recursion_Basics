public class HarmonicNumber {
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(harmonicNum(n));
    }

    public static double harmonicNum(int n){
        if(n==1){
            return 1.0; //base case
        }
        return 1.0/n + harmonicNum(n-1); //recursive call
    }
}
