import java.util.Scanner;

public class if9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();

       if (a > b) {
           int temp = b;
           int a1 = b = a;
           int a2 = a = temp;
       }
        System.out.println("A son: " + a);
        System.out.println("B son: " + b);
    }
}
