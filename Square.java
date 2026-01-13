import java.util.Scanner;
public class Square{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int sqr=num*num;
        System.err.println("This is the square of your value: "+sqr);
    }
}