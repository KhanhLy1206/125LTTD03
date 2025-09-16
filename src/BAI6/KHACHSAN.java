package BAI6;
import java.util.ArrayList;
import java.util.Scanner;
public class KHACHSAN {
    private ArrayList<KHACHTHUE> dsKhachThue118;
    public KHACHSAN(){
        dsKhachThue118 = new ArrayList<>();
    }
    public void themKhachThue(KHACHTHUE kt){
        dsKhachThue118.add(kt);
    }
    public void nhapDSKHACH(Scanner sc){
        KHACHTHUE kt = new KHACHTHUE();
        int n;
        do{
            System.out.println("Nhập số khách thuê: ");
            n = Integer.parseInt(sc.nextLine());
        }while(n <= 0);
        for(int i = 0; i < n; i++){
            System.out.println("Nhập thông tin khách thuê thứ " + (i+1) + ": ");
            kt = new KHACHTHUE();
            kt.NHAP(sc);
            themKhachThue(kt);
        }
    }
    public void xuatDSKHACH(){
        for(KHACHTHUE kt: dsKhachThue118){
            kt.XUAT();
            System.out.println("---------------");
        }
    }
    public double tinhTongTienPhong(String socmnd){
        double tongTien = 0;
        for(KHACHTHUE kt: dsKhachThue118){
            if(kt.getSoCMND118().equals(socmnd)){
                tongTien=kt.getSoNgayTro118()*kt.getGiaPhong118()
;                break;
            }
        }
        
        return tongTien;
    }
}
