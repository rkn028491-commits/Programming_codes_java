import java.util.Scanner;
public class stringBuilder {
    public static void main(String []args){
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println("Characters of sb are:");
        for(int i=0;i<sb.length();i++){
            System.out.println(sb.charAt(i));
        }
        System.out.println("Updating string by using StringBuider:");
        sb.setCharAt(0,'p');
        System.out.println(sb);
        System.out.println("inserting elements to string:");
        sb.insert(0,'T');
        System.out.println(sb);
        System.out.println("Deleting elements to string:");
        sb.delete(0,1);
        System.out.println(sb);
        System.out.println("Appending elements to string:");
        sb.append("s");
        System.out.println(sb);
        System.out.println("length of string is:"+sb.length());
    }
    
}
