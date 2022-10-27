import java.util.Scanner;

public class if16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();

        if (a > b && b < c) {
            System.out.println((a * 2) + " " + (b * 2) + " " + (c * 2));
        }else {
            System.out.println((a = b) + " " + (b = c) + " " + (c = a));
        }
    }
}
