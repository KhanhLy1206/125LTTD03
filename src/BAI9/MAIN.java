package BAI9;
import java.util.Scanner;
public class MAIN {
    public static void main(String[] args) {
        QLTV qltv118 = new QLTV();
        Scanner sc = new Scanner(System.in);
        int lc;
        do {
            System.out.println("-------------Quản lý thư viện---------------");
            System.out.println("Nhập lựa chọn cửa bạn ");
            System.out.println("1.Nhập thông tin thẻ mượn ");
            System.out.println("2.Xuất danh sách thẻ");
            System.out.println("3.Danh sách thẻ có hạn trả cuối tháng");
            System.out.println("0.Thoát chương trình!");
            lc = sc.nextInt();
            sc.nextLine();
            switch (lc) {
                case 1:
                    qltv118.nhapDSTM(sc);
                    break;
                case 2:
                    qltv118.xuatDSTM();
                    break;
                case 3:
                    qltv118.hienThiDSTraCuoiThang();
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
