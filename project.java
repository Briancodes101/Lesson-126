import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers to divide");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println(x+" divided by "+y+" = "+z);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}