package BAI3;
import java.util.Scanner;
public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLTL ql118 = new QLTL();
        int choice;
        do {
            System.out.println("===Menu Quản Lý Tài Liệu===");
            System.out.println("1. Nhập tài liệu");
            System.out.println("2. Xuất tài liệu");
            System.out.println("3. Tìm kiếm tài liệu theo mã");
            System.out.println("4. Tìm kiếm tài liệu theo loại");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine(); // Đọc dòng còn lại
            switch (choice) {
                case 1:
                    ql118.nhapDSTL(sc);
                    break;
                case 2:
                    ql118.hienThiDanhSach();
                    break;
                case 3:
                    System.out.println("Nhập mã tài liệu cần tìm: ");
                    String maTL = sc.nextLine();
                    ql118.timKiemTheoMa(maTL);
                    break;
                case 4:
                    System.out.println("Nhập loại tài liệu cần tìm (Sách, Tạp chí, Báo): ");
                    String loai = sc.nextLine();
                    ql118.timKiemTheoLoai(loai);
                    break;

            }
        } while (choice != 0);
    }
}
