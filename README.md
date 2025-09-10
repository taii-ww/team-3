import java.util.Scanner;

public class LaiSuatNganHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien gui: ");
        double soTienGui = sc.nextDouble();
        System.out.print("Nhap lai suat nam (%): ");
        double laiSuatNam = sc.nextDouble();
        System.out.print("Nhap so thang gui: ");
        int soThang = sc.nextInt();
        double laiSuatThang = laiSuatNam / 12 / 100;
        double tienLai = soTienGui * laiSuatThang * soThang;
        double tongTien = soTienGui + tienLai;
        System.out.println("Tien lai: " + tienLai);
        System.out.println("Tong tien cuoi ky: " + tongTien);
        sc.close();
    }
}
