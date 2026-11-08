import java.util.Scanner;
public class Strings {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name1:");
        String name1=sc.nextLine();
        System.out.print("Enter your name2:");
        String name2=sc.nextLine();
        System.out.print("String concatination:");
        System.out.println(name1+" "+name2);
        System.out.println("length of name1:"+name1.length());
        System.out.println("length of name2:"+name2.length());
        System.out.println("name1 characters are:");
        for(int i=0;i<name1.length();i++){
            System.out.println(name1.charAt(i));
        }
        System.out.print("Comparing strings:");
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        System.out.print("Extracting specified substring:");
        System.out.print(name1.substring(0,4));

    }
}
