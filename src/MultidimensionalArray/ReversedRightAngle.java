package MultidimensionalArray;
import java.util.Scanner;

public class ReversedRightAngle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=scanner.nextInt();

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
