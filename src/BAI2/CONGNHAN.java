package BAI2;

public class CONGNHAN extends CANBO {
    private String bac118;

    public CONGNHAN() {
    }

    public CONGNHAN(String bac) {
        this.bac118 = bac;
    }

    public CONGNHAN(String hoTen, String ngaySinh, boolean gioiTinh, String diaChi, String bac) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bac118 = bac;
    }

    public String getBac() {
        return bac118;
    }

    public void setBac(String bac) {
        this.bac118 = bac;
    }
    @Override
    public void NHAP()
    {
        super.NHAP();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhập bậc: ");
        bac118 = sc.nextLine();
    }
    @Override
    public void XUAT() {
        super.XUAT();
        System.out.println("Bậc: " + bac118);
    }

}
