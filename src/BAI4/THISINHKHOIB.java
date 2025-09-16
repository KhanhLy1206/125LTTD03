package BAI4;
import java.util.Scanner;
public class THISINHKHOIB extends THISINH{
    private float diemToan_118;
    private float diemHoa118;
    private float diemSinh118;
    public THISINHKHOIB(){
        super();
    }
    public THISINHKHOIB(String soBaoDanh, String hoTen, String diaChi,String dienUuTienKhuVuc,Float diemToan,float diemHoa,float diemSinh){
        super(soBaoDanh,hoTen,diaChi,dienUuTienKhuVuc);
        this.diemToan_118=diemToan;
        this.diemHoa118=diemHoa;
        this.diemSinh118=diemSinh;
    }
    public float getDiemToan_118(){
        return diemToan_118;
    }
    public float getDiemHoa118(){
        return diemHoa118;
    }
    public float getDiemSinh118(){
        return diemSinh118;
    }
    public void setDiemToan_118(Float diemToan){
        this.diemToan_118=diemToan;
    }
    public void setDiemHoa118(Float diemHoa){
        this.diemHoa118=diemHoa;
    }
    public void setDiemSinh118(Float diemSinh){
        this.diemSinh118=diemSinh;
    }
    public void NHAP(Scanner sc){
        super.NHAP(sc);
        System.out.println("Nhập điểm toán: ");
        this.diemToan_118=sc.nextFloat();
        System.out.println("Nhập điểm hóa: ");
        this.diemHoa118=sc.nextFloat();
        System.out.println("Nhập điểm sinh: ");
        this.diemSinh118=sc.nextFloat();
        sc.nextLine();
    }
    public void XUAT(){
        super.XUAT();
        System.out.println("Điểm toán: "+this.diemToan_118);
        System.out.println("Điểm hóa: "+this.diemHoa118);
        System.out.println("Điểm sinh: "+this.diemSinh118);}

}
