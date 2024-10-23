public class DecimaltoBinary {
    
    public static void main(String[] args) {
        int n = 14;
        System.out.println(dectobin(n, 0, 0));
    }

    public static int dectobin(int dec, int bin, int i){
        if(dec == 0){ //base case
            return bin;
        }
        bin = bin + (dec % 2) * (int)Math.pow(10, i);
        return dectobin(dec/2, bin, i+1); //recursive call
    } 
}
