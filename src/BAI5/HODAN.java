package BAI5;

import java.util.Scanner;

public class HODAN {
    private int soNguoi118;
    private int soNha118;
    private NGUOI[] ds118;

    public HODAN() {
    }

    public HODAN(int soNguoi118, int soNha118, NGUOI[] ds118) {
        this.soNguoi118 = soNguoi118;
        this.soNha118 = soNha118;
        this.ds118 = ds118;
    }

    public int getSoNguoi118() {
        return soNguoi118;
    }

    public void setSoNguoi118(int soNguoi118) {
        this.soNguoi118 = soNguoi118;
    }

    public int getSoNha118() {
        return soNha118;
    }

    public void setSoNha118(int soNha118) {
        this.soNha118 = soNha118;
    }

    public NGUOI[] getDs118() {
        return ds118;
    }

    public void setDs118(NGUOI[] ds118) {
        this.ds118 = ds118;
    }

    public void NHAP(Scanner sc) {
        System.out.print("Nhập số người: ");
        soNguoi118 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số nhà: ");
        soNha118 = Integer.parseInt(sc.nextLine());
        ds118 = new NGUOI[soNguoi118];
        System.out.println("Nhập thông tin từng thành viên trong hộ:");
        for (int i = 0; i < soNguoi118; i++) {
            System.out.println("Nhập thông tin người thứ " + (i + 1) + ":");
            ds118[i] = new NGUOI();
            ds118[i].NHAP(sc);
        }
    }

    public void XUAT() {
        System.out.println("Số người: " + soNguoi118);
        System.out.println("Số nhà: " + soNha118);
        System.out.println("Thông tin các thành viên trong hộ:");
        for (int i = 0; i < soNguoi118; i++) {
            System.out.println("Thông tin người thứ " + (i + 1) + ":");
            ds118[i].XUAT();
        }
    }
    
    public NGUOI[] getDsThanhVien() {
        return ds118;
    }

    public int getSoThanhVien() {
        return soNguoi118;
    }

}
