package BAI4;
import java.util.Scanner;
public class THISINHKHOIC extends THISINH{
    private float diemVan118;
    private float diemSu118;
    private float diemDia118;
    public THISINHKHOIC(){
        super();
    }
    public THISINHKHOIC(String soBaoDanh, String hoTen, String diaChi,String dienUuTienKhuVuc,Float diemVan,float diemSu,Float diemDia){
        super(soBaoDanh,hoTen,diaChi,dienUuTienKhuVuc);
        this.diemVan118=diemVan;
        this.diemSu118=diemSu;
        this.diemDia118=diemDia;
    }
    public float getDiemVan118(){
        return diemVan118;
    }
    public float getDiemSu118(){
        return diemSu118;
    }
    public float getDiemDia118(){
        return diemDia118;
    }
    public void setDiemVan118(Float diemVan){
        this.diemVan118=diemVan;
    }
    public void setDiemSu118(Float diemSu){
        this.diemSu118=diemSu;
    }
    public void setDiemDia118(Float diemDia){
        this.diemDia118=diemDia;
    }
    public void NHAP(Scanner sc){
        super.NHAP(sc);
        System.out.println("Nhập điểm văn: ");
        this.diemVan118=sc.nextFloat();
        System.out.println("Nhập điểm sử: ");
        this.diemSu118=sc.nextFloat();
        System.out.println("Nhập điểm địa: ");
        this.diemDia118=sc.nextFloat();
        sc.nextLine();
    }
    public void XUAT(){
        super.XUAT();
        System.out.println("Điểm văn: "+this.diemVan118);
        System.out.println("Điểm sử: "+this.diemSu118);
        System.out.println("Điểm địa: "+this.diemDia118);}

}
