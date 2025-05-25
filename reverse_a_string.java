class Reverse {
    public static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}

public class reverse_a_string {
    public static void main(String[] args){
        System.out.println(Reverse.reverse("ananya")); // ✅ Correct static call
    }
}