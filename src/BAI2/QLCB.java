package BAI2;
import java.util.Scanner;
import java.util.ArrayList;
public class QLCB {
    private ArrayList<CANBO> danhSachCB118=new ArrayList<>();
    private Scanner sc=new Scanner(System.in);
    public void NHAPCANBO(){
        System.out.println("Chọn loại cán bộ để nhập:");
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        System.out.print("Lựa chọn của bạn: ");
        int luaChon = sc.nextInt();
        sc.nextLine(); // Đọc dòng còn lại
        CANBO canbo = null;
        switch (luaChon) {
            case 1:
                canbo = new CONGNHAN();
                break;
            case 2:
                canbo = new KYSU();
                break;
            case 3:
                canbo = new NHANVIEN();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                return;
        }
        canbo.NHAP();
        danhSachCB118.add(canbo);
    }
    public void XUATCANBO(){
        if (danhSachCB118.isEmpty()) {
            System.out.println("Danh sách cán bộ trống!");
            return;
        }
        System.out.println("\n--- DANH SÁCH CÁN BỘ ---");
        for (CANBO cb : danhSachCB118) {
            cb.XUAT();
            System.out.println("----------------------");
        }
    }
    
    public void timKiemThoeTenCB(String ten) {
        boolean kq = false;
        for (CANBO cb : danhSachCB118) {
            if (cb.getHoTen().toLowerCase().contains(ten.toLowerCase())) {
                cb.XUAT();
                kq = true;
            }
        }
        if (!kq) {
            System.out.println("Không tìm thấy cán bộ có tên chứa: " + ten);
        }
    }

}
