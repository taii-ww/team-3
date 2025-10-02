public class Test {
    public static void main(String[] args) {
        sach sach1 = new sach("B001", "lap trinh java", "Nguyen Van A", 2022, 5);

        sach sach2 = new sach();
        sach2.setMaSach("B002");
        sach2.setTieuDe("cau truc du lieu");
        sach2.setTacGia("Tran Van B");
        sach2.setNamXuatBan(2022);
        sach2.setSoLuong(10);

        //Hiển thị thông tin
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}
