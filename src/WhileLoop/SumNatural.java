package WhileLoop;
import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number to find the sum of all the natural numbers");
        int n=scanner.nextInt();
        int s=0,i=0;

        while(i<n){
            s=s+i;
            i++;
        }
        System.out.println("The sum is :"+s);
    }
}
