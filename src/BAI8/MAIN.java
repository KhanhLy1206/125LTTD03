package BAI8;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        QLCBGV qlcgv118=new QLCBGV();
        int lc;
        do{
            System.out.println("===Menu Quản Lý Cán Bộ Giảng Viên===");
            System.out.println("1. Nhập danh sách cán bộ giảng viên");
            System.out.println("2. Xuất danh sách cán bộ giảng viên");
            System.out.println("3. Tìm kiếm giảng viên có lương thực lĩnh lớn hơn 8 triệu");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            lc=sc.nextInt();
            sc.nextLine();
            switch(lc){
                case 1:
                    qlcgv118.nhapDSCBGV(sc);
                    break;
                case 2:
                    qlcgv118.xuatDSCBGV();
                    break;
                case 3:
                    qlcgv118.timKiemGVLuongLon8tr();
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        }while (lc!=0);
    }
}
