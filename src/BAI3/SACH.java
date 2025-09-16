package BAI3;

import java.util.Scanner;

public class SACH extends TAILIEU{
    private  String tenTacGia118;
    private int soTrang118;
    public SACH(){ 
        super();
    }
    public SACH(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia118 = tenTacGia;
        this.soTrang118 = soTrang;
    }
    public String getTenTacGia() {
        return tenTacGia118;
    }
    public int getSoTrang() {
        return soTrang118;
    }
    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia118 = tenTacGia;
    }
    public void setSoTrang(int soTrang) {
        this.soTrang118 = soTrang;

    }
    public void NHAP(Scanner sc){
        super.NHAP(sc);
        System.out.println("Nhập tên tác giả: ");
        tenTacGia118=sc.nextLine();
        System.out.println("Nhập số trang: ");
        soTrang118=Integer.parseInt(sc.nextLine());
    }
}
