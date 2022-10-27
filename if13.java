import java.util.Scanner;

public class if13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();

        if (a < b && b < c) {
            System.out.println(b);
        } else if (b < a && a < c) {
            System.out.println(a);
        }else {
            System.out.println(c);
        }
    }
}
