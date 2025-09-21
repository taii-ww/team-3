import java.util.Scanner;

public class Bai6 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int x = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int y = sc.nextInt();
        int ucln = gcd(x, y);
        int bcnn = lcm(x, y);
        System.out.println("UCLN cua " + x + " va " + y + " la: " + ucln);
        System.out.println("BCNN cua " + x + " va " + y + " la: " + bcnn);

        sc.close();
    }
}
