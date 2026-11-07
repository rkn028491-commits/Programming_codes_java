import java.util.Scanner;
public class Z {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter no. of columns:");
        int cols=sc.nextInt();
        int[][] Matrix=new int[rows][cols];
        System.out.println("Enter elements of Matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                Matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter element x");
        int x=sc.nextInt();
        System.out.println("elements of Matrix are:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(Matrix[i][j] +" ");
                if(Matrix[i][j]==x){
                    System.out.println("\nx is in:("+ i + "," + j +")" );
                }
            }
            System.out.println();
        }
    }
}
