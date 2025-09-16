package BAI10;

import java.util.ArrayList;
import java.util.Scanner;

public class QUANLY {
    private ArrayList<BIENLAI> ds118;

    public QUANLY() {
        ds118 = new ArrayList<>();
    }

    public void nhapDS(Scanner sc) {
        int n;
        do {
            System.out.print("Nhập số lượng biên lai: ");
            n = sc.nextInt();
            sc.nextLine();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            System.out.println("---- Nhập biên lai thứ " + (i + 1) + " ----");
            BIENLAI bl = new BIENLAI();
            bl.NHAP(sc);
            ds118.add(bl);
        }
    }

    public void xuatDS() {
        System.out.println("===== DANH SÁCH BIÊN LAI =====");
        for (BIENLAI bl : ds118) {
            bl.XUAT();
        }
    }

    public void tongTien() {
        int tong = 0;
        for (BIENLAI bl : ds118) {
            tong += bl.getSoTien118();
        }
        System.out.println("===> Tổng số tiền điện của tất cả hộ: " + tong + " VND");
    }
}
