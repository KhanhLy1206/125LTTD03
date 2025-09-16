package BAI10;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        QUANLY ql118 = new QUANLY();
        Scanner sc = new Scanner(System.in);
        int lc;

        do {
            System.out.println("------------- Quản lý biên lai tiền điện ---------------");
            System.out.println("1. Nhập danh sách biên lai");
            System.out.println("2. Xuất danh sách biên lai");
            System.out.println("3. Tính tổng tiền điện");
            System.out.println("0. Thoát chương trình");
            System.out.print("Chọn: ");
            lc = sc.nextInt();
            sc.nextLine();

            switch (lc) {
                case 1:
                    ql118.nhapDS(sc);
                    break;
                case 2:
                    ql118.xuatDS();
                    break;
                case 3:
                    ql118.tongTien();
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (lc != 0);
    }
}
