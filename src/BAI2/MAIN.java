package BAI2;
import java.util.Scanner;
public class MAIN {
    public static void main(String[] args) {
        QLCB qlcb=new QLCB();
        int choice;
        do {
        System.out.println("===Menu Quản Lý Cán Bộ===");
        System.out.println("1. Nhập cán bộ");
        System.out.println("2. Xuát cán bộ");
        System.out.println("3. Tìm kiếm cán bộ");
        Scanner sc=new Scanner(System.in);
        System.out.print("Lựa chọn của bạn: ");
        choice=sc.nextInt();
        sc.nextLine(); // Đọc dòng còn lại
        switch (choice) {
            case 1:
                qlcb.NHAPCANBO();
                break;
            case 2:
                qlcb.XUATCANBO();
                break;
            case 3:
                System.out.println("Nhập têm cán bộ cần tìm: ");
                String ten=sc.nextLine();
                qlcb.timKiemThoeTenCB(ten);
                break;
            default:
                System.out.println("Lựa chọn ko hợp lê!");
        }
    }while (choice!=0);
}
}
