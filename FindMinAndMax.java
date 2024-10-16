public class FindMinAndMax {
    
    public static void main(String[] args) {
        int[] arr = {1,4,6,2,3,8,4};
        minAndmax(arr, arr[0], arr[0], 0);
    }

    public static void minAndmax(int arr[], int min, int max, int i){
        if(i >= arr.length){
            System.out.println("Min = "+ min +" Max = "+ max); //base case
        }
        if(arr[i] < min){
            min = arr[i];
        }
        if(arr[i] > max){
            max = arr[i];
        }
        minAndmax(arr, min, max, i+1); //recursive call
    }
}
