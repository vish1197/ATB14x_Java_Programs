package ForLoop;
import java.util.Scanner;

public class TableOf5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number to prints its table");
        int n=scanner.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(+n+"*"+i+"="+(n*i));
        }

    }
}

