public class MultiD_arr {
    int arr[][] = new int[3][3];
    public void input() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }
    }
    public void display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();}
        }
    public static void main(String[] args) {
        MultiD_arr obj = new MultiD_arr();
        obj.input();
        obj.display();  
    }
}
