import java.util.Scanner;

public class if23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x1 ni kiriting: ");
        int x1 = sc.nextInt();
        System.out.print("y1 ni kiriting: ");
        int y1 = sc.nextInt();
        System.out.print("x2 ni kiriting: ");
        int x2 = sc.nextInt();
        System.out.print("y2 ni kiriting: ");
        int y2 = sc.nextInt();
        System.out.print("x3 ni kiriting: ");
        int x3 = sc.nextInt();
        System.out.print("y3 ni kiriting: ");
        int y3 = sc.nextInt();

        if (x2 == x3) {
            System.out.println("X4: " + x1);
        } else {
            if (x3 == x1) {
                System.out.println("X4: " + x2);
            }else {
                System.out.println("X4: " + x3);
            }
            if (y2 == y3) {
                System.out.println("Y4: " + y1);
            } else {
                if (y3 == y1) {
                    System.out.println("Y4: " + y2);
                }else {
                    System.out.println("Y4: " + y3);
                }
            }
        }
    }
}
