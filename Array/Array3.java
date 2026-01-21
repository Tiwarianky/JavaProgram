public class Array3{
    public static void main(String[] args) {
        int[] num={6,7,4,9,3,0,5};
        int sum=0;
        int x=5;

        for(int i=1; i<num.length; i++){
            if(num[i]==x)
            System.out.println("x found at index: "+i);
        }

        
    }}