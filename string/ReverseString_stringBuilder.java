public class ReverseString_stringBuilder {
    public static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }   

    public static void main(String[] args){
        System.out.println(Reverse.reverse("ananya")); // Output: aynana
    }
}
