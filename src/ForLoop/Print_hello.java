package ForLoop;
import java.util.Scanner;

public class Print_hello {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("HELLO");
        }

    }
}
