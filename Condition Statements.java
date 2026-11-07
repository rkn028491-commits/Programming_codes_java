                                              (First Program)
  import java.util.Scanner;
class E {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();
        if(age>18){
            System.out.print("Adult");
        }
        else{
            System.out.print("not Adult");
        }

    }
    
}
                                                (Second Program)


import java.util.Scanner;
class F {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if (num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
                                                (Third Program)


import java.util.Scanner;
class G {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Both are equal");
        }
        else if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("a is smaller");
        }
    }
    
}
