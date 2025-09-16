package BAI2;
import java.util.Scanner;
public class NHANVIEN extends CANBO {
    private String congViec118;
    public NHANVIEN() {
    }
    public NHANVIEN(String congViec) {
        this.congViec118 = congViec;
    }

    public NHANVIEN(String hoTen, String ngaySinh, boolean gioiTinh, String diaChi, String congViec) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.congViec118 = congViec;
    }

    public String getCongViec() {
        return congViec118;
    }

    public void setCongViec(String congViec) {
        this.congViec118 = congViec;
    }
    
    @Override
    public void NHAP()
    {
        super.NHAP();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập công việc: ");
        congViec118=sc.nextLine();
    }
    
    @Override
    public void XUAT() {
        super.XUAT();
        System.out.println("Công việc: " + congViec118);
    }
    
    
}
