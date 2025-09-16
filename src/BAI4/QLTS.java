package BAI4;
import java.util.Scanner;
import java.util.ArrayList;
public class QLTS {
    private ArrayList<THISINH> dsts118;
    public QLTS(){
        dsts118=new ArrayList<THISINH>();
    }
    public void themThiSinh(THISINH ts){
        dsts118.add(ts);
    }
    public void xoaThiSinh(String soBaoDanh){
        for(int i=0;i<dsts118.size();i++){
            if(dsts118.get(i).getSoBaoDanh118().equals(soBaoDanh)){
                System.out.println("Tìm thấy thí sinh: ");
                dsts118.get(i).XUAT();
                dsts118.remove(i);
                System.out.println("Đã xóa thí sinh!");


            }else{
                System.out.println("Không tìm thấy thí sinh!");
            }
        }
    }
    public void NhapDanhSach(Scanner sc){
        int lc;
        String stop;
        THISINH ts;
        do{
            System.out.println("Nhập loại thí sinh muốn thêm: 1.Khối A 2.Khối B 3.Khối C");
            lc=sc.nextInt();
            sc.nextLine();
            switch(lc){
                case 1:
                    ts=new THISINHKHOIA();
                    ts.NHAP(sc);
                    themThiSinh(ts);
                    break;
                case 2:
                ts=new THISINHKHOIB();
                ts.NHAP(sc);
                themThiSinh(ts);
                break;
                case 3:
                ts=new THISINHKHOIC();
                ts.NHAP(sc);
                themThiSinh(ts);
                break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
            System.out.println("Nhập 'c' để tiếp tục, nhập ký tự khác để dừng");
            stop=sc.nextLine();

        }while(stop.equals("c"));

    }
        
    void XuatDanhSach(){
        for(THISINH ts:dsts118){
            ts.XUAT();
            System.out.println("---------------");
        }
    }
    void timKiemTheoSBD(String sBD){
        for(THISINH ts:dsts118){
            if(ts.getSoBaoDanh118().equals(sBD)){
                System.out.println("Tìm thấy thí sinh: ");
                ts.XUAT();
                return;
            }
        }
        System.out.println("Không tìm thấy thí sinh!");
    }

}
