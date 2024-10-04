public class LengthOfString {
    
    public static void main(String[] args) {
        System.out.println(stringLength("Kanishk", 0, 0));
    }

    public static int stringLength(String s, int i, int len){
        if(i >= s.length()){
            return len;
        }
        len++;
        return stringLength(s, i+1, len);
    }
}
