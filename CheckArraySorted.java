public class CheckArraySorted {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(check(arr, 0)); 
    }

    public static boolean check(int[] arr, int i){
        if(i >= arr.length-1){ //base case
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return check(arr, i+1); //recursive call
    }
}
