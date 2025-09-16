package BAI10;

import java.util.Scanner;

public class BIENLAI extends KHACHHANG {
    private int chiSoCu118;
    private int chiSoMoi118;
    private int soTien118;

    public BIENLAI() {
    }

    public BIENLAI(String hoTen118, String soNha118, String maCongTo118,
            int chiSoCu118, int chiSoMoi118) {
        super(hoTen118, soNha118, maCongTo118);
        this.chiSoCu118 = chiSoCu118;
        this.chiSoMoi118 = chiSoMoi118;
        this.soTien118 = (chiSoMoi118 - chiSoCu118) * 750;
    }

    public int getSoTien118() {
        return soTien118;
    }

    public void NHAP(Scanner sc) {
        System.out.print("Nhập họ tên chủ hộ: ");
        setHoTen118(sc.nextLine());
        System.out.print("Nhập số nhà: ");
        setSoNha118(sc.nextLine());
        System.out.print("Nhập mã công tơ: ");
        setMaCongTo118(sc.nextLine());
        System.out.print("Nhập chỉ số cũ: ");
        chiSoCu118 = sc.nextInt();
        System.out.print("Nhập chỉ số mới: ");
        chiSoMoi118 = sc.nextInt();
        sc.nextLine();
        soTien118 = (chiSoMoi118 - chiSoCu118) * 750;
    }

    @Override
    public void XUAT() {
        super.XUAT();
        System.out.println("Chỉ số cũ: " + chiSoCu118);
        System.out.println("Chỉ số mới: " + chiSoMoi118);
        System.out.println("Số tiền phải trả: " + soTien118 + " VND");
        System.out.println("-----------------------------------");
    }
}
