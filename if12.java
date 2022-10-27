import java.util.Scanner;

public class if12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();

        if (a < b) {
            System.out.println("Sonlarning kichigi: " + a);
        } else if (b < c) {
            System.out.println("Sonlarning kichigi: " + b);
        } else if (c < a) {
            System.out.println("Sonlarning kichigi: " + c);
        }
    }
}
