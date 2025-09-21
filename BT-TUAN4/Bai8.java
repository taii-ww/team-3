import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int mostFreq = arr[0]; 
        int maxCount = 0;      
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFreq = arr[i];
            }
        }

        System.out.println("Phan tu xuat hien nhieu nhat la: " + mostFreq);
        System.out.println("So lan xuat hien: " + maxCount);

        sc.close();
    }
}
