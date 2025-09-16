package BAI3;

public class BAO extends TAILIEU{
    private int ngayPhatHanh118;
    public BAO(){
        super();
    }
    public BAO(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh118 = ngayPhatHanh;
    }
    public int getNgayPhatHanh() {
        return ngayPhatHanh118;
    }
    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh118 = ngayPhatHanh;
    }
    public void NHAP(java.util.Scanner sc){
        super.NHAP(sc);
        System.out.println("Nhập ngày phát hành: ");
        ngayPhatHanh118=Integer.parseInt(sc.nextLine());
    }
    public void XUAT(){
        super.XUAT();
        System.out.println("Ngày phát hành: "+ngayPhatHanh118);
    }
    
}
