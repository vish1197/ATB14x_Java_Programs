package ForLoop;
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number until which to find the sum of Natural numbers");
        int n=scanner.nextInt();
        int S=0;

        for(int i=1;i<=n;i++){
            S=S+i;
        }
        System.out.println("The sum is :"+S);


    }

}
