package WhileLoop;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the upper limit number");
        int n=scanner.nextInt();
        int i=0;
        while(i<n){
            i++;
            System.out.println(i);
        }
    }
}
