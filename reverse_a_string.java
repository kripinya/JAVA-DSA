//to reverse the given string

class Reverse {
    public static String reverse(String s){
        String reversed = "";
        for(int i = s.length() - 1; i >=0; i--){
            reversed += s.charAt(i);
        }
        return reversed;
    }
    
}
public class reverse_a_string {
    public static void main(String[] args){
    Reverse r = new Reverse();
    String result = r.reverse("ananya");
    System.out.println("reverse of string is:" + result);
    }
}
