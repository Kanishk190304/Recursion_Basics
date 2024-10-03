import java.util.*;

public class StringPalindromeCheck {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check the palindrome condition for : "); // input
        String str = sc.nextLine();
        System.out.println(checkPalindrome(str, 0, str.length()-1)); // output
        sc.close();
        
    }

    public static boolean checkPalindrome(String s, int left, int right){

        if(left >= right){ // base case
            return true; 
        }

        if(s.charAt(left) != s.charAt(right)){ //palindrome condition
            return false;
        }

        return checkPalindrome(s, left+1, right-1); // recursive call
    }
}
