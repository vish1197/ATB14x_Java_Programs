package WhileLoop;
import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of n to repeat the string");
        int n=scanner.nextInt();
        String str;      int i=1;

        while(i<=n){
            System.out.println("Java");
            i++;
        }

    }
}
