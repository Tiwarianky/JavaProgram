//To check age and marks and print msg----

import java.util.Scanner;
public class Shortlist
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age as per mention in your documents: ");
        int age=sc.nextInt();
        System.out.println("Enter your obtained marks: ");
        float marks=sc.nextFloat();

        if(age>=18 & age<=24 & marks>60){
           System.out.println("Congratualations!,You are shortlisted for this post");
        }else{
            System.out.println("Sorry,You are not eligible");

        }



        
    }
}