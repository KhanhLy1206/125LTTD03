package BAI4;
import java.util.Scanner;
public class MAIN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        QLTS qlts118=new QLTS();
        int lc;
        do{
            System.out.println("===Menu Quản Lý Thí Sinh===");
            System.out.println("1. Nhập danh sách thí sinh");
            System.out.println("2. Xuất danh sách thí sinh");
            System.out.println("3. Tìm kiếm thí sinh theo số báo danh");
            System.out.println("4. Xóa thí sinh theo số báo danh");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            lc=sc.nextInt();
            sc.nextLine();
            switch(lc){
                case 1:
                    qlts118.NhapDanhSach(sc);
                    break;
                case 2:
                    qlts118.XuatDanhSach();
                    break;
                case 3:
                    String sBD;
                    System.out.println("Nhập số báo danh cần tìm: ");
                    sBD=sc.nextLine();
                    qlts118.timKiemTheoSBD(sBD);
                    break;
                case 4:
                    String soBD;
                    System.out.println("Nhập số báo danh cần xóa: ");
                    soBD=sc.nextLine();
                    qlts118.xoaThiSinh(soBD);
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }while (lc!=0);
        sc.close();

    }
}
