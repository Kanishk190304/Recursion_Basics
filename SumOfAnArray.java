import java.util.*;

public class SumOfAnArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements : ");
        for(int i=0; i<n; i++){
            System.out.print("A[" + i +"] = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of the array = " + calSum(0, arr, 0));
        sc.close();
    }

    public static int calSum(int sum, int[] arr, int i){

        if(i >= arr.length){ //base case
            return sum;
        }
        sum += arr[i];
        return calSum(sum, arr, i+1); //recursive call
    }
}
