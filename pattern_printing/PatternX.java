import java.util.Scanner;

public class PatternX {
    private static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();
        int x = 1, y = n;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(x == j || y == j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            x++;
            y--;
            System.err.println();
        }       
    }
}
