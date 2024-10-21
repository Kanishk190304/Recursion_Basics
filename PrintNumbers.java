public class PrintNumbers {
    
    public static void main(String[] args) {
        int n = 5;
        printNumbersNto1(n); 
        System.out.println();
        printNumbers1toN(n);
    }

    public static void printNumbersNto1(int n){
        if(n==0){ //base case
            return;
        }
        System.out.print(n + " ");
        printNumbersNto1(n-1); //recursive call
    }
    public static void printNumbers1toN(int n){
        if(n==0){
            return;
        }
        printNumbers1toN(n-1); //recursive call
        System.out.print(n + " ");
    }
}
