package ex_02_Java_Basics;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the Array");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int res=0;

        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            res=res+arr[i];
        }
        System.out.println("The sum of array elements is :"+ res);

        // Calculate and print the sum

    }
}
