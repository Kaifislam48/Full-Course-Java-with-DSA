import java.util.Scanner;
public class MaximumOfThreeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        /* 
        if(a>b && a>c){
            System.out.println("Maximum number is: "+a);
        }
        else if(b>a &&  b>c){
            System.out.println("Maximum number is: "+b);
        }
        else{
            System.out.println("Maximum number is: "+c);
        }
            */

        if(a>b){
            if(b>c){
                System.out.println("Maximum number is: "+a);
            }
            else{
                System.out.println("Maximum number is: "+c);
            }
        }
        else{
                System.out.println("Maximum number is: "+b);
            }
    }
}
