public class StringLinearSearch {
    public static void main(String[] args){
        String name = "Ananya";
        int n = name.length();
        String target = "y";
        boolean found = false;
        for(int i = 0; i<n; i++){
            if(name.charAt(i) == target.charAt(0)){
                System.out.println("Found at position " + (i+1));
                found = true;
                break;
        } 
        }
        if(!found){
            System.out.println("Not found");
        }
    }
}
