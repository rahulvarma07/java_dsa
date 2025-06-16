import java.util.Scanner;

public class HollowSquarePattern {
    public static int n;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print n lines of hollow square : ");
        n = scanner.nextInt();
        scanner.close();
        for(int i = 1; i <= n; i++){
            if(i == 1 || i == n){
                for(int j = 1; j <= n; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j = 1; j <= n; j++){
                    if(j == 1 || j == n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.err.println();
        }
    }
}
