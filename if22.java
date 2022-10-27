import java.util.Scanner;

public class if22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("OX: ");
        int ox = sc.nextInt();
        System.out.print("OY: ");
        int oy = sc.nextInt();
        int chorak = 0;
        if (ox > 0 && oy > 0) {
            chorak = 1;
        } else if (ox < 0 && oy > 0) {
            chorak = 2;
        } else if (ox < 0 && oy < 0) {
            chorak = 3;
        } else {
            chorak = 4;
        }
        System.out.println(chorak);
    }
}
