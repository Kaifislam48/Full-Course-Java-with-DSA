import java.util.Scanner;

public class InputFuction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age is: ");
        int age = sc.nextInt();
        System.out.println("Hello " + name + "!");
        System.out.println("Your age is: "+age);
        }

}
