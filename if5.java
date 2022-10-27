import java.util.Scanner;

public class if5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();
        int count = 0;
        int count1 = 0;

        if (a > 0){count++;}  else if (a < 0) {count1++;}
        if (b > 0){count++;}  else if (b < 0) {count1++;}
        if (c > 0){count++;}  else if (c < 0) {count1++;}

        System.out.println(count + " ta musbat son bor !");
        System.out.println(count1 + " ta manfiy son bor !");
    }
}