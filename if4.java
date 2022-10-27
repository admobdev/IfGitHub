import java.util.Scanner;

public class if4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();
        int count = 0;

        if (a > 0) count++;
        if (b > 0) count++;
        if (c > 0) count++;

        System.out.println(count + " ta musbat son bor !");
    }
}
