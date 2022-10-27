import java.util.Scanner;

public class if18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();

        if (a == b) {
            System.out.println(c + " uchinchi");
        } else if (b == c) {
            System.out.println(a + " ikkinchi");
        }else {
            System.out.println(b + " birinchi");
        }
    }
}
