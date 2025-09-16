package BAI6;
import java.util.Date;
import java.util.Scanner;
public class KHACHTHUE extends NGUOI{
    private int soNgayTro118;
    private String loaiPhongTro118;
    private double giaPhong118;
    public KHACHTHUE(){}
    public KHACHTHUE(String hoVaTen, Date ngaySinh, String soCMND, int soNgayTro, String loaiPhongTro, double giaPhong) {
        this.hoVaTen118 = hoVaTen;
        this.ngaySinh118 = ngaySinh;
        this.soCMND118 = soCMND;
        this.soNgayTro118 = soNgayTro;
        this.loaiPhongTro118 = loaiPhongTro;
        this.giaPhong118 = giaPhong;
    }
    public void NHAP(Scanner sc){
        super.NHAP(sc);
        System.out.println("Nhập số ngày trọ: ");
        soNgayTro118 = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập loại phòng trọ: ");
        loaiPhongTro118 = sc.nextLine();
        System.out.println("Nhập giá phòng: ");
        giaPhong118 = Double.parseDouble(sc.nextLine());
    }
    public void XUAT(){
        super.XUAT();
        System.out.println("Số ngày trọ: " + soNgayTro118);
        System.out.println("Loại phòng trọ: " + loaiPhongTro118);
        System.out.println("Giá phòng: " + giaPhong118);
    }
    public int getSoNgayTro118() {
        return soNgayTro118;
    }
    public double getGiaPhong118() {
        return giaPhong118;
    }
}
