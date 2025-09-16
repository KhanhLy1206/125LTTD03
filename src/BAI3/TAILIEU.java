package BAI3;
import java.util.Scanner;
public class TAILIEU {
    private String maTaiLieu118;
    private String tenNhaXuatBan118;
    private int soBanPhatHanh118;
    public TAILIEU(){

    }
    public TAILIEU(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu118 = maTaiLieu;
        this.tenNhaXuatBan118 = tenNhaXuatBan;
        this.soBanPhatHanh118 = soBanPhatHanh;
    }
    public String getMaTaiLieu() {
        return maTaiLieu118;
    }
    public String getTenNhaXuatBan() {
        return tenNhaXuatBan118;
    }
    public int getSoBanPhatHanh() {
        return soBanPhatHanh118;
    }
    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu118 = maTaiLieu;
    }
    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan118 = tenNhaXuatBan;
    }
    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh118 = soBanPhatHanh;
    }
    void NHAP(Scanner sc){
        System.out.println("Nhập mã tài liệu: ");
        maTaiLieu118=sc.nextLine();
        System.out.println("Nhập tên nhà xuất bản: ");
        tenNhaXuatBan118=sc.nextLine();
        System.out.println("Nhập số bản phát hành: ");
        soBanPhatHanh118=Integer.parseInt(sc.nextLine());
    }
    void XUAT(){
        System.out.println("Mã tài liệu: "+maTaiLieu118);
        System.out.println("Tên nhà xuất bản: "+tenNhaXuatBan118);
        System.out.println("Số bản phát hành: "+soBanPhatHanh118);
    }
}
