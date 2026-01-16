import java.util.*;
public class areaofcircle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double r=sc.nextDouble();
        double pi=3.14;
        double area=pi*r*r;
        System.out.println("Area of circle is: "+area);

        
    }
}