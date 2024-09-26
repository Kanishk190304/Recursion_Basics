import java.util.*;

public class FindFactorial {
    
    public static void main(String[] args) {
        
        System.out.print("Enter any number and get it's factorial : "); 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //Input
        System.out.println("Factorial of " + n + " = " + factorial(n)); //Output       
    }

    public static int factorial(int n){
        
        if(n <= 1){
            return 1; //As 0! = 1 and 1! = 1
        }
        return n * factorial(n-1); //As we know that for n=10, 10! = 10 * 9!
    }
}
