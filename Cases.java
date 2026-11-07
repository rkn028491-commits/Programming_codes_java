                                                         (First Program)
import java.util.Scanner;
class H{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("hi");
                break;
            case 3:
                System.out.println("namaste");
                break;
            default:
                System.out.println("invalid button!");
                

        }
    }
}

                                                        (Second Program)

import java.util.Scanner;
class I{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Addition ="+ (a+b));
                break;
            case 2:
                System.out.println("Substraction ="+ (a-b));
                break;
            case 3:
                System.out.println("multiplication ="+ (a*b));
                break;
            default:
                System.out.println("Invalid input!");


                
        }

    }
}
