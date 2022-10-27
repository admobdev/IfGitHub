import java.util.Scanner;

public class if8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();

        if (a > b) System.out.println(" Kattasi: " + a + "\n Kichigi: " + b);
    }
}
