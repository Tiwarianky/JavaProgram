
import java.util.Scanner;

public class AvgCal{
    public static void main(String[]args0){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        float avg = (a+b)/2;
        System.out.println("Avg of two number is: "+ avg);
    }
}