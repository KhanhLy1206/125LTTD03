package BAI2;

import java.util.Scanner;

public class CANBO {
    private String hoTen118;
    private String ngaySinh118;
    private boolean gioiTinh118; // true: Nam, false: Nữ
    private String diaChi118;
    public CANBO() {
    }
    public CANBO(String hoTen, String ngaySinh, boolean gioiTinh, String diaChi) {
        this.hoTen118 = hoTen;
        this.ngaySinh118 = ngaySinh;
        this.gioiTinh118 = gioiTinh;
        this.diaChi118 = diaChi;
    }
    public String getHoTen() {
        return hoTen118;
    }
    public String getNgaySinh() {
        return ngaySinh118;
    }
    public boolean isGioiTinh() {
        return gioiTinh118;
    }
    public String getDiaChi() {
        return diaChi118;
    }
    public void setHoTen(String hoTen) {
        this.hoTen118 = hoTen;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh118 = ngaySinh;
    }
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh118 = gioiTinh;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi118 = diaChi;
    }
    public void NHAP() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập họ tên: ");
    this.hoTen118 = sc.nextLine();
    System.out.print("Nhập ngày sinh: ");
    this.ngaySinh118 = sc.nextLine();
    System.out.print("Nhập giới tính (true=Nam, false=Nữ): ");
    this.gioiTinh118 = sc.nextBoolean();
    sc.nextLine(); // bỏ dòng thừa
    System.out.print("Nhập địa chỉ: ");
    this.diaChi118 = sc.nextLine();
}

    public void XUAT(){
        System.out.println("Họ tên: "+hoTen118);
        System.out.println("Ngày sinh: "+ngaySinh118);
        System.out.println("Giới tính: "+(gioiTinh118?"Nam":"Nữ"));
        System.out.println("Địa chỉ: "+diaChi118);
    }
}
