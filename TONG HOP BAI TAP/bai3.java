import java.util.Scanner;
public class TinhToanHaiSoNguyen {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất: ");
        int soThuNhat = nhap.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int soThuHai = nhap.nextInt();
        int tong = soThuNhat + soThuHai;
        int hieu = soThuNhat - soThuHai;
        int tich = soThuNhat * soThuHai;
        if (soThuHai != 0) {
            int thuong = soThuNhat / soThuHai;
            int soDu = soThuNhat % soThuHai;
            System.out.println("Tổng: " + tong);
            System.out.println("Hiệu: " + hieu);
            System.out.println("Tích: " + tich);
            System.out.println("Thương: " + thuong);
            System.out.println("Số dư: " + soDu);
        } else {
            System.out.println("Không thể chia cho 0.");
            System.out.println("Tổng: " + tong);
            System.out.println("Hiệu: " + hieu);
            System.out.println("Tích: " + tich);
        }
        nhap.close();
    }
}
