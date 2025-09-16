package BAI6;

import java.util.Scanner;

public class QLKS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KHACHSAN ks118=new KHACHSAN();
        int lc;
        do {
            System.out.println("===Menu Quản Lý Khách Sạn===");
        System.out.println("1. Nhập danh sách khách thuê");
        System.out.println("2. Xuất danh sách khách thuê");
        System.out.println("3. Tính tổng tiền phòng theo số CMND");
        System.out.println("0. Thoát");
        System.out.print("Lựa chọn của bạn: ");
        lc = sc.nextInt();
        sc.nextLine();
        switch(lc){
            case 1:
                ks118.nhapDSKHACH(sc);
                break;
            case 2:
                ks118.xuatDSKHACH();
                break;
            case 3:
                String socmnd;
                System.out.println("Nhập số CMND cần tính tổng tiền phòng: ");
                socmnd=sc.nextLine();
                double tongTien=ks118.tinhTongTienPhong(socmnd);
                if(tongTien==0){
                    System.out.println("Không tìm thấy khách thuê với số CMND trên!");
                }else{
                    System.out.println("Tổng tiền phòng của khách thuê với số CMND " + socmnd + " là: " + tongTien);
                }
                break;
            case 0:
                System.out.println("Thoát chương trình!");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
            
        } while (lc!=0);
    }
}
