//Print the the table of n
import java.util.*;

public class Forloop{
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for print table of that number: ");
        int n=sc.nextInt();
       /* 
         for(int i=1; i<=10; i++){
            System.out.print(i*n+" ");
         }*/
    
    //Print the sum of first n numbers-----
    int sum=0;
    for(int i=1; i<=n; i++){
        sum=sum+i;
    }
            System.out.println(sum);


}}
