public class TriangularNumber {
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(triangularNum(n, 1, 0));
    }

    public static int triangularNum(int n, int i, int t){
        if(i > n){
            return t;
        }
        t = t + i;
        return triangularNum(n, i+1, t);
    }
}
