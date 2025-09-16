package BAI4;
import java.util.Scanner;
public class THISINH {
    private String soBaoDanh118;
    private String hoTen118;
    private String diaChi118;
    private String dienUuTienKhuVuc118;

    public THISINH(){

    }
    public THISINH(String soBaoDanh118, String hoTen118, String diaChi118, String dienUuTienKhuVuc118) {
        this.soBaoDanh118=soBaoDanh118;
        this.hoTen118=hoTen118;
        this.diaChi118=diaChi118;
        this.dienUuTienKhuVuc118=dienUuTienKhuVuc118;
    }
    public String getSoBaoDanh118() {
        return soBaoDanh118;
    }
    public String getHoTen118() {
        return hoTen118;
    }
    public String getDiaChi118() {
        return diaChi118;
    }
    public String getDienUuTienKhuVuc118() {
        return dienUuTienKhuVuc118;
    }
    public void setSoBaoDanh118(String soBaoDanh118){
        this.soBaoDanh118=soBaoDanh118;
    }
    public void setHoTen118(String hoTen118) {
        this.hoTen118 = hoTen118;
    }
    public void setDiaChi118(String diaChi118) {
        this.diaChi118 = diaChi118;
    }
    public void setDienUuTienKhuVuc118(String dienUuTienKhuVuc118) {
        this.dienUuTienKhuVuc118 = dienUuTienKhuVuc118;
    }
    public void NHAP(Scanner sc){
        System.out.println("Nhập số báo danh: ");
        this.soBaoDanh118=sc.nextLine();
        System.out.println("Nhập họ tên: ");
        this.hoTen118=sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.diaChi118=sc.nextLine();
        System.out.println("Nhập diện ưu tiên khu vực: ");
        this.dienUuTienKhuVuc118=sc.nextLine();
    }
    public void XUAT(){
        System.out.println("Số báo danh: "+this.soBaoDanh118);
        System.out.println("Họ tên: "+this.hoTen118);
        System.out.println("Địa chỉ: "+this.diaChi118);
        System.out.println("Diện ưu tiên khu vực: "+this.dienUuTienKhuVuc118);
    }
}
