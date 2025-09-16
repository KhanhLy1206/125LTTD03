package BAI8;
import java.util.Scanner;
import java.util.ArrayList;
public class QLCBGV {
    private ArrayList<CBGV> dSCBGV118;
    public QLCBGV(){
        dSCBGV118 = new ArrayList<>();
    }
    public void themCBGV(CBGV gv){
        dSCBGV118.add(gv);
    }
    public void nhapDSCBGV(Scanner sc){
        CBGV gv = new CBGV();
        int n;
        do {
            System.out.println("Nhập số lượng giảng viên muốn nhập: ");
            n= sc.nextInt();
            sc.nextLine();

        } while (n<=0);
        for(int i=0; i<n;i++){
            System.out.println("Nhập thông tin giảng viên thứ "+(i+1)+": ");
            gv.NHAP(sc);
            themCBGV(gv);
        }
    }
    public void xuatDSCBGV(){
        for(CBGV gv:dSCBGV118){
            gv.XUAT();
            System.out.println("---------------");
        }
    }
    
    public void timKiemGVLuongLon8tr() {
        boolean found = false;
        for (CBGV gv : dSCBGV118) {
            if (gv.getLuongThucLinh118() > 8000000) {
                if (!found) {
                    System.out.println("Thông tin giảng viên có lương thực lĩnh lớn hơn 8 triệu:");
                }
                gv.XUAT();
                System.out.println("---------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có giảng viên nào có lương thực lĩnh lớn hơn 8 triệu");
        }
    }

}
