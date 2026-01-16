import java.util.Scanner;
public class percent{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter marks of sub1: ");
        int sub1=sc.nextInt();

        System.out.println("Enter marks of sub2: ");
        int sub2=sc.nextInt();

        System.out.println("Enter marks of sub3: ");
        int sub3=sc.nextInt();

        System.out.println("Enter marks of sub4: ");
        int sub4=sc.nextInt();

        System.out.println("Enter marks of sub5: ");
        int sub5=sc.nextInt();
        
        System.out.println("Enter Total maximum marks: ");
        int totalMM=sc.nextInt();
        int ttmarks=sub1+sub2+sub3+sub4+sub5;
double percent = (ttmarks * 100.0) / totalMM;
       System.out.println("this is your obtained percentage: "+percent);


    }
}