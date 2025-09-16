package BAI2;
import java.util.Scanner;
public class KYSU extends CANBO{
    private String nganhDaoTao118;
    public KYSU() {
    }
    public KYSU(String nganhDaoTao) {
        this.nganhDaoTao118 = nganhDaoTao;
    }

    public KYSU(String hoTen, String ngaySinh, boolean gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.nganhDaoTao118 = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao118;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao118 = nganhDaoTao;
    }
    @Override
    public void NHAP()
    {
        super.NHAP();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngành đào tạo: ");
        nganhDaoTao118 = sc.nextLine();
    }
    @Override
    public void XUAT() {
        super.XUAT();
        System.out.println("Ngành đào tạo: " + nganhDaoTao118);
    }
}
