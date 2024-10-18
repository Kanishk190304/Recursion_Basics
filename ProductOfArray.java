public class ProductOfArray {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(productOfArray(arr, 1, 0));
    }

    public static int productOfArray(int[] arr, int product, int i){
        if(i >= arr.length){
            return product; //base case
        }
        product *= arr[i];
        return productOfArray(arr, product, i+1); //recursive call
    }
}
