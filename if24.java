import java.util.Scanner;

public class if24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X ni kiriting: ");
        int x = sc.nextInt();

        if (x > 0) System.out.println(2 * Math.sin(x));
        else System.out.println(x - 6);
    }
}
