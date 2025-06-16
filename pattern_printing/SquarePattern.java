
import java.util.Scanner;

public class SquarePattern {
    private static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print n line of square : ");
        n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
