Bài 2
import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b: ");
        int b = sc.nextInt();
        System.out.print("Nhap so c: ");
        int c = sc.nextInt();

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        System.out.println("So nho nhat la: " + min);

        sc.close();
    }
}
Bài 5
import java.util.Scanner;

public class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong phai la so nguyen to.");
        }

        sc.close();
    }
}
BÀI 9
import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Danh sach so nguyen da nhap:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
