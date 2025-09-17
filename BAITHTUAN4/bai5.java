import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen: ");
        int so = nhap.nextInt();

        if (isPrime(so)) {
            System.out.println(so + " la so nguyen to.");
        } else {
            System.out.println(so + " khong phai la so nguyen to.");
        }
        nhap.close();
    }

    public static boolean isPrime(int so) {
        if (so < 2) return false;
        for (int i = 2; i <= Math.sqrt(so); i++) {
            if (so % i == 0) return false;
        }
        return true;
    }
}

