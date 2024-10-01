import java.util.*;

public class GCD {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : "); // First input
        int a = sc.nextInt();
        System.out.print("Enter second number : "); // Second input
        int b = sc.nextInt();
        System.out.println("GCD of " + a + " and " + b + " = " + gcd(a, b)); // Output
        sc.close();
    }  
    
    public static int gcd(int a, int b){ // Recursive function

        if(a == 0){
            return b; // Base case
        }

        return gcd(b%a, a); // Recursive call
    }
}
