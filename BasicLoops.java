import java.util.*;
public class BasicLoops{
    public static void main(String[] args){
        System.out.print("Enter number n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
        for(int i=0; i<n; i++){
            System.out.println("Hello World!");
        }
        */

        for(int i=1; i<=n; i++){
            System.out.print(i+ " ");
        }

    }
}