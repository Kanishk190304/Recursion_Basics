public class BinarySearchRecursion {
    
    public static void main(String[] args) {
        int[] arr = {1,3,5,12,15,16}; // Given array
        System.out.println(bS(arr, 0, arr.length-1, 16)); // Output
    }

    public static int bS(int[] arr, int left, int right, int target){ // Recursive Function

        if(left > right){ // Base case
            return -1;
        }
        int mid = left + (right - left) / 2; // Middle index
        if(arr[mid] == target){
            return mid; // Target found at mid
        }
        if(target < arr[mid]){
            return bS(arr, left, mid-1, target); // Recursive call for left half 
        }
        else{
            return bS(arr, mid+1, right, target); // Recursice call for right half
        }
    }
}
