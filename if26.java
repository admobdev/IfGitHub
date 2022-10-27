import java.util.Scanner;

public class if26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X ni kiriting: ");
        int x = sc.nextInt();

        if (x <= 0) {
            System.out.println(-x);
        }
        if ( 0 < x && x < 2) {
            System.out.println(Math.pow(x,2));
        }
        if (x >= 2) {
            System.out.println(4);
        }
    }
}
