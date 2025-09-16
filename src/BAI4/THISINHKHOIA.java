package BAI4;
import java.util.Scanner;
public class THISINHKHOIA extends THISINH {
    private float diemToan118;
    private float diemLy118;
    private float diemHoa118;
    public THISINHKHOIA(){
        super();
    }
    public THISINHKHOIA(String soBaoDanh, String hoTen, String diaChi,String dienUuTienKhuVuc,Float diemToan,float diemLy,Float diemHoa){
        super(soBaoDanh,hoTen,diaChi,dienUuTienKhuVuc);
        this.diemToan118=diemToan;
        this.diemLy118=diemLy;
        this.diemHoa118=diemHoa;
    }
    public float getDiemToan118(){
        return diemToan118;
    }
    public float getDiemLy118(){
        return diemLy118;
    }
    public float getDiemHoa118(){
        return diemHoa118;
    }
    public void setDiemToan118(Float diemToan){
        this.diemToan118=diemToan118;
    }
    public void setDiemLy118(Float diemLy){
        this.diemLy118=diemLy;
    }
    public void setDiemHoa118(Float diemHoa){
        this.diemHoa118=diemHoa;
    }
    public void NHAP(Scanner sc){
        super.NHAP(sc);
        System.out.println("Nhập điểm toán: ");
        this.diemToan118=sc.nextFloat();
        System.out.println("Nhập điểm lý: ");
        this.diemLy118=sc.nextFloat();
        System.out.println("Nhập điểm hóa: ");
        this.diemHoa118=sc.nextFloat();
        sc.nextLine();
    }
    public void XUAT(){
        super.XUAT();
        System.out.println("Điểm toán: "+this.diemToan118);
        System.out.println("Điểm lý: "+this.diemLy118);
        System.out.println("Điểm hóa: "+this.diemHoa118);
    }
}
