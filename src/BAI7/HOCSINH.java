package BAI7;

public class HOCSINH  extends NGUOI{
    private String lop118;
    private String khoaHoc118;
    private String kyHoc118;
    public HOCSINH(){}
    public HOCSINH(String hoVaTen, java.util.Date ngaySinh, String queQuan, String lop, String khoaHoc, String kyHoc) {
        super(hoVaTen, ngaySinh, queQuan);
        this.lop118 = lop;
        this.khoaHoc118 = khoaHoc;
        this.kyHoc118 = kyHoc;
    }
    public void NHAP(java.util.Scanner sc){
        super.NHAP(sc);
        System.out.println("Nhập lớp: ");
        lop118=sc.nextLine();
        System.out.println("Nhập khóa học: ");
        khoaHoc118=sc.nextLine();
        System.out.println("Nhập kỳ học: ");
        kyHoc118=sc.nextLine();
    }
    public void XUAT(){
        super.XUAT();
        System.out.println("Lớp: "+lop118);
        System.out.println("Khóa học: "+khoaHoc118);
        System.out.println("Kỳ học: "+kyHoc118);
    }
    public String getLop118() {
        return lop118;
    }
    public void setLop118(String lop118) {
        this.lop118 = lop118;
    }
    
}
