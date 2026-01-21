public class Array1 {
    public static void main(String[] args) {

        int[]num={10,20,30,40,50,60}; //array 1
        int sum=0;

        String[]str={"Shiv","Ram","mohan"}; //array 2
        System.out.println(str[2]);

        System.out.println("The length of this array is: "+num.length);
        for (int i = 0; i < num.length; i++) {
               sum+=num[i];}
        System.out.println(sum);
    }}
