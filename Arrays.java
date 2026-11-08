import java.util.Scanner;
public class Y {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements to be inserted");
        int n=sc.nextInt();
        int[] marks= new int[n];
        System.out.println("Enter the element to be inserted");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("enter a number to find its index");
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            if(marks[i]==x){
                System.out.println("x found at index :"+i);
            }
            
        }
        

    }
        

}
