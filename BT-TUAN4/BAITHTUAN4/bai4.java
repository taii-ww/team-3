import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = nhap.nextInt();
        int tong = 0;

        for (int i = 1; i <= n; i++) {
            tong += i;
        }

        System.out.println("Tong tu 1 den " + n + " la: " + tong);
        sc.close();
    }
}

