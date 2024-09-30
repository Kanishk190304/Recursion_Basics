import java.util.*;

public class ReverseString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to be reversed : ");
        String str = sc.nextLine(); 
        System.out.println("Reversed string : " + reverseString(str));
        sc.close();
    }

    public static String reverseString(String str){
        if(str.isEmpty()){
            return str; // reverse("") returns "" -> reverse("c") returns "" + 'c' = "c"
        }
        return reverseString(str.substring(1)) + str.charAt(0); // "abc" = reverse("bc") + 'a' -> "c" = reverse("") + 'c'
    }
}
