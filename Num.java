import java.util.Scanner;
public class Num{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        if (num>0){
            System.out.print("Number is positive");
        }else{
            System.out.print("Number is not positive");
        }
    }
}