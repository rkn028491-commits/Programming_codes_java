                                                          (First Program)
import java.util.Scanner;
public class T {
    public static void printMyName(String name){
        System.out.println (name);
        return;
    }
    public static void main(String args[]){
        System.out.println("Enter a name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        printMyName(name);

    }
    
}
                                                          (Second Program)

import java.util.Scanner;
public class U {
    public static int Add2Numbers(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=Add2Numbers(a,b);
        System.out.println(sum);


    }
    
}
