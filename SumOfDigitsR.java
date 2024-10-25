import java.util.*;
public class SumOfDigitsR {
    
    public static void main(String[] args) {
        System.out.print("Enter any number and get the sum of it's digits : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input
        System.out.println("Sum of digits of " + n + " = " + findSum(n, 0)); // Output

    }

    public static int findSum(int n, int sum){
        if(n==0){
            return sum; //Base case
        }
        sum += n%10;
        return findSum(n/10, sum); //Recursive call
    }
}
