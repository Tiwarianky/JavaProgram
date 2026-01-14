public class Sb1{
    public static void main(String[] args) {

        //charAt in StringBuilder-----
    StringBuilder sb=new StringBuilder("Ankit");
    System.out.println(sb.charAt(0));

    //setCharAt index-----
    sb.setCharAt(0,'p');
    System.out.println(sb);
    }

    //insert char------
    sb.insert(0,'S');
     System.out.println(sb);

}