public class Pattern2{
    public static void main(String[]args){

        int n=4;
        for(int i=0; i<=n; i++){
        System.out.print("* ");
    }
    for(int j=0; j<=n; j++){
        System.out.println("*");
    }
    

    //Full pyramid logic-----------------

    //count variable
    for(int i=n; i>=1; i--){

// print space
       for(int j=i; j<n; j++){
        System.out.print(" ");
       }

//print star
          for(int k=1; k<=(2*i-1); k++){
            System.out.print("*");
          }      
       System.out.println();
    }

  //count variable
    for(int i=1; i<=n; i++){

// print space
       for(int j=i; j<n; j++){
        System.out.print(" ");
       }

//print star
          for(int k=1; k<=(2*i-1); k++){
            System.out.print("*");
          }      
       System.out.println();
    }

}
}