import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[3];
        int [] b = new int[3];
        double x = 0;
        double y = 0;

        for(int i = 0; i<3; i++){
        a[i] = sc.nextInt();
        b[i] = sc.nextInt();
        }

        for(int i = 0; i<3; i++){
        x += a[i];
        y += b[i];
        }
        x = x/3;
        y = y/3;

        System.out.printf("(%.1f, %.1f)", x, y);
    }
}