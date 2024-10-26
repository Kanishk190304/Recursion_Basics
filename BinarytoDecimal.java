public class BinarytoDecimal {
    
    public static void main(String[] args) {
        int n = 1110;
        System.out.println(bintodec(n, 0, 0));
    }

    public static int bintodec(int bin, int dec, int i){
        if(bin == 0){ //base case
            return dec;
        }
        dec = dec + (bin % 10) * (int) Math.pow(2, i);
        return bintodec(bin/10, dec, i+1); //recursive call
    }
}
