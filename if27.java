import java.util.Scanner;

public class if27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X ni kiriting: ");
        int z = sc.nextInt(); int y;

        if (z < 0) {
            y = 0;
        } else if (z % 2 == 0) {
            y = 1;
        } else {
            y = -1;
        }
        System.out.println(y);
    }
}
