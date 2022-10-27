import java.util.Scanner;

public class if20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();

        int ab = Math.abs(a - b);
        int ac = Math.abs(a - c);
        if (ab > ac) {
            System.out.println("nuqta A nuqataga yaqin");
            System.out.println("Uning uzuligi: " + ac);
        } else {
            System.out.println("B nuqta A nuqtaga yaqin");
            System.out.println("Uning uzunligi: " + ab);

            //  if (a < b && a < c )
            //      System.out.println(" a va b orasi: " + (b - a) + "  " + " b va c orasidagi masofa "  + (c - b));
        }
    }
}
