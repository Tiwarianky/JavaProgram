public class Pattern1{
    public static void main(String[] args){
                  
      //print solid rectngle -----------------
<<<<<<< HEAD

       for(int i=1;i<=4; i++){
        for(int j=1; j<=5; j++){
            System.out.print("*");
=======
       for(int i=1;i<=4; i++){
        for(int i=1;i<=4; i++){
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();   
>>>>>>> 46e8382c5f259d8c393c5dd13354f91d98782ddc
        }
        System.out.println();   
    }

        //print hollow rectangle-----------------
        for(int i=1; i<=4; i++){
            for(int j=1; j<=5; j++){
                if(i==1||j==1||i==4||j==5)
                System.out.print("*");
                else
                System.out.print(" ");
            }
    }

        //print hollow rectangle-----------------
        for(int i=1; i<=4; i++){
            for(int j=1; j<=5; j++){
                if(i==1||j==1||i==4||j==5)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

       //print half pyramid-----------------
       for(int i=1; i<=5; i++){
        for(int j=1; j<=i; j++){
           System.out.print("*");
        }
        System.out.println();
       }

      //print reverse half pyramid--------------
       for(int i=5; i>=1; i--){
        for(int j=1; j<=i; j++){
           System.out.print("*");
        }
        System.out.println();
       } 
      //print full pyramid-----------------



}}
