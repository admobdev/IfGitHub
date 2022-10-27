import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int num = sc.nextInt();

        if (num > 0) num++;
        else num = num - 2;
        System.out.println(num);
    }
}
