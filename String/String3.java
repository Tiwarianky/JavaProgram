//Replace character in string----
public class String3{
    public static void main(String[] args) {
        String nm="king of karnataka krishnaraj kapaswami";
        String nm1=nm.replace('k','a');
        System.out.println(nm1);
System.out.println("");


    //Substring method------
    System.out.println("This is the output of your substring method: "+nm.substring(0,4));
System.out.println("");

//compare-----
String str1="hello";
String str2="Hello";

System.out.println(str1.compareTo(str2)==0);
System.out.println("");
}
}