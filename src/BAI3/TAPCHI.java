package BAI3;
import java.util.Scanner;
public class TAPCHI extends TAILIEU{
    private int soPhatHanh118;
    private int thangPhatHanh118;
    public TAPCHI(){
        super();
    }
    public TAPCHI(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh118 = soPhatHanh;
        this.thangPhatHanh118 = thangPhatHanh;
    }
    public int getSoPhatHanh() {
        return soPhatHanh118;
    }
    public int getThangPhatHanh() {
        return thangPhatHanh118;
    }
    
    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh118 = soPhatHanh;
    }
    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh118 = thangPhatHanh;
    }
    public void NHAP(Scanner sc){
        super.NHAP(sc);
        System.out.println("Nhập số phát hành: ");
        soPhatHanh118=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tháng phát hành: ");
        thangPhatHanh118=Integer.parseInt(sc.nextLine());
    }
    public void XUAT(){
        super.XUAT();
        System.out.println("Số phát hành: "+soPhatHanh118);
        System.out.println("Tháng phát hành: "+thangPhatHanh118);
    }
}
