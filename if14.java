import java.util.Scanner;

public class if14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println(a);
            if (b < c) System.out.println(b + "\n" + c);
            else System.out.println(c + "\n" + b);
        }else if (b < a && b < c) {
            System.out.println(b);
            if (a < c) System.out.println(a + "\n" + b);
            else System.out.println(c + "\n" + a);
        }else {
            System.out.println(c);
            if (a < b) System.out.println(a + "\n" + b);
            else System.out.println(b + "\n" + a);
        }
    }
}
