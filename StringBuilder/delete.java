public class delete{
    public static void main(String[] args) {
        
    //delete char at index----}
    StringBuilder sb= new StringBuilder("Rohit Sharma");
    sb.delete(6,12);
    System.out.println(sb);
    }

    //apend char-----
    sb.append("Virat");
    System.out.println(sb);
}