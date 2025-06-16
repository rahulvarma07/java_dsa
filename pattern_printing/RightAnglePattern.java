import java.util.Scanner;

public class RightAnglePattern {
    private static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number n to print right angle of n lines : ");
        n = scanner.nextInt();
        scanner.close();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.err.println();
        }
    }
}
