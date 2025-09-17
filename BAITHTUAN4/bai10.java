import java.util.ArrayList;
import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Nhap so phan tu ban dau: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            list.add(sc.nextInt());
        }
        System.out.println("Danh sach hien tai: " + list);

        System.out.print("Nhap gia tri can them: ");
        int valueAdd = sc.nextInt();
        System.out.print("Nhap vi tri muon them (bat dau tu 1 den " + (list.size()+1) + "): ");
        int posAdd = sc.nextInt();
        if (posAdd >= 1 && posAdd <= list.size() + 1) {
            list.add(posAdd - 1, valueAdd); // tru 1 vi ArrayList bat dau tu 0
        } else {
            System.out.println("Vi tri khong hop le!");
        }
        System.out.println("Danh sach sau khi them: " + list);

        System.out.print("Nhap vi tri muon xoa (bat dau tu 1 den " + list.size() + "): ");
        int posRemove = sc.nextInt();
        if (posRemove >= 1 && posRemove <= list.size()) {
            list.remove(posRemove - 1); // tru 1 vi ArrayList bat dau tu 0
        } else {
            System.out.println("Vi tri khong hop le!");
        }
        System.out.println("Danh sach sau khi xoa: " + list);

        sc.close();
    }
}
