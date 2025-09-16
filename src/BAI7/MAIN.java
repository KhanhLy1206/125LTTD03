package BAI7;
import java.util.Scanner;
public class MAIN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        QLHS qlhs118=new QLHS();
        int lc;
        do{
            System.out.println("===Menu Quản Lý Học Sinh===");
            System.out.println("1. Nhập danh sách học sinh");
            System.out.println("2. Xuất danh sách học sinh");
            System.out.println("3. Tìm kiếm học sinh có năm sinh 1985 và quê ở Thái Nguyên");
            System.out.println("4. Tìm kiếm học sinh lớp 10A1");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            lc=sc.nextInt();
            sc.nextLine();
            switch(lc){
                case 1:
                    qlhs118.nhapDSHS(sc);
                    break;
                case 2:
                    qlhs118.xuatDSHS();
                    break;
                case 3:
                    qlhs118.timKiemHS();
                    break;
                case 4:
                    qlhs118.timKiemHS10A1();
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
