public class CountElement {
    
    public static void main(String[] args) {
        int[] arr = {11,33,11,2,4,6,4,2,24,152,1,323,11};
        System.out.println(countit(arr, 0, 0, 11));
    }

    public static int countit(int[] arr, int count, int i, int target){
        if(i >= arr.length){
            return count; //base case - last index
        }
        if(arr[i] == target){
            count++;
        }
        return countit(arr, count, i+1, target); //recursive call for next index
    }
}
