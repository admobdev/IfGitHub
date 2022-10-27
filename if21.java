import java.util.Scanner;

public class if21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int num = sc.nextInt();
        System.out.print("OX: ");
        int ox = sc.nextInt();
        System.out.print("OY: ");
        int oy = sc.nextInt();

        if (num == 0 && num == 0) {
            System.out.println(0);
        } else if (num < ox && num < oy) {
            System.out.println(1 + " " + 2);
        }else {
            System.out.println(3);
        }
    }
}
