import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        double a = sc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double b = sc.nextDouble();
        System.out.println("Chon phep tinh:");
        System.out.println("1. Cong (+)");
        System.out.println("2. Tru (-)");
        System.out.println("3. Nhan (*)");
        System.out.println("4. Chia (/)");
        System.out.print("Lua chon cua ban: ");
        int choice = sc.nextInt();
        double result = 0;
        boolean valid = true;
        switch (choice) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Loi: Khong the chia cho 0!");
                    valid = false;
                }
                break;
            default:
                System.out.println("Lua chon khong hop le!");
                valid = false;
        }

        // In kết quả
        if (valid) {
            System.out.println("Ket qua: " + result);
        }

        sc.close();
    }
}
