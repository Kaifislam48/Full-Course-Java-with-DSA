import java.util.*;
public class TwoNumberCompare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        if(a  == b){
            System.out.println("a is equal to b!");
        }
        else{
            if(a > b){
                System.out.println("a is greater than b!");
            }
            else{
                System.out.println("a is less than b!");
            }
        }

    }
}
