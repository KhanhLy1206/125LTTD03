package BAI8;
import java.util.Scanner;
public class CBGV  extends NGUOI{
    private double luongCung118;
    private double luongThuong118;
    private double luongPhat118;
    private double luongThucLinh118;
    public CBGV(){
        super();
    }
    public CBGV(String hoVaTen118, java.util.Date ngaySinh118, String queQuan118, double luongCung118, double luongThuong118, double luongPhat118) {
        super(hoVaTen118, ngaySinh118, queQuan118);
        this.luongCung118 = luongCung118;
        this.luongThuong118 = luongThuong118;
        this.luongPhat118 = luongPhat118;
        this.luongThucLinh118 = luongCung118 + luongThuong118 - luongPhat118;
    }
    public double getLuongCung118() {
        return luongCung118;
    }
    public void setLuongCung118(double luongCung118) {
        this.luongCung118 = luongCung118;
    }
    public double getLuongThuong118() {
        return luongThuong118;
    }
    public void setLuongThuong118(double luongThuong118) {
        this.luongThuong118 = luongThuong118;
    }
    public double getLuongPhat118() {
        return luongPhat118;
    }
    public void setLuongPhat118(double luongPhat118) {
        this.luongPhat118 = luongPhat118;
    }
    public double getLuongThucLinh118() {
        return luongThucLinh118;
    }
    public void setLuongThucLinh118(double luongThucLinh118) {
        this.luongThucLinh118 = luongThucLinh118;
    }
    @Override
    public void NHAP(Scanner sc){
        super.NHAP(sc);
        System.out.println("Nhập lương cứng: ");
        luongCung118 = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập lương thưởng: ");
        luongThuong118 = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập lương phạt: ");
        luongPhat118 = Double.parseDouble(sc.nextLine());
        luongThucLinh118 = luongCung118 + luongThuong118 - luongPhat118;
    }

    public void XUAT(){
        super.XUAT();
        System.out.println("Lương cứng: " + luongCung118);
        System.out.println("Lương thưởng: " + luongThuong118);
        System.out.println("Lương phạt: " + luongPhat118);
        System.out.println("Lương thực lĩnh: " + luongThucLinh118);
    }
}