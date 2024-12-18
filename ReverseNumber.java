public class ReverseNumber {
    
    public static void main(String[] args) {
        int n = 123;
        System.out.println(reverseNum(n, 0));
    }

    public static int reverseNum(int n, int rev){
        if(n == 0){ //base case
            return rev;
        }
        rev = rev * 10 + n%10;
        return reverseNum(n/10, rev); //recursive call
    }
}
