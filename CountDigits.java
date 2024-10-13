public class CountDigits {
    
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(countDigits(n, 0));
    }

    public static int countDigits(int n, int count){
        if(n == 0){
            return count; //base case
        }
        count++;
        return countDigits(n/10, count); //recursive call
    }
}
