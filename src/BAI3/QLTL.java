package BAI3;
import java.util.Scanner;
import java.util.ArrayList;
public class QLTL {
    private ArrayList<TAILIEU> danhSachTaiLieu118;
    public QLTL(){
        danhSachTaiLieu118=new ArrayList<>();
    }
    public void themTaiLieu(TAILIEU taiLieu){
        danhSachTaiLieu118.add(taiLieu);
    }
    public void xoaTaiLieu(TAILIEU taiLieu){
        danhSachTaiLieu118.remove(taiLieu);
    }
    public void nhapDSTL(Scanner sc){
        int lc;
        String stop;
        TAILIEU tl;
        do{
            System.out.println("Nhập loại tài liệu muốn thêm: 1.Sách 2.Tạp chí 3.Báo");
            lc=sc.nextInt();
            sc.nextLine();
            switch(lc){
                case 1:
                    tl=new SACH();
                    tl.NHAP(sc);
                    themTaiLieu(tl);
                    break;
                case 2:
                    tl=new TAPCHI();
                    tl.NHAP(sc);
                    themTaiLieu(tl);
                    break;
                case 3:
                    tl=new BAO();
                    tl.NHAP(sc);
                    themTaiLieu(tl);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
            System.out.println("Nhập 'c' để tiếp tục, nhập ký tự khác để dừng");
            stop=sc.nextLine();

        }while(stop.equals("c"));
    }

    public void timKiemTheoMa(String maTL){
        for (TAILIEU tl: danhSachTaiLieu118) {
            if(maTL.equals(tl.getMaTaiLieu())){
                tl.XUAT();
            }
        }
    }
    public void timKiemTheoLoai(String loai){
        for(TAILIEU tl: danhSachTaiLieu118){
            if(loai.equals("Sách")&& tl instanceof SACH){
                tl.XUAT();
            }else if(loai.equals("Tạp chí")&& tl instanceof TAPCHI){
                tl.XUAT();
            }else if(loai.equals("Báo")&& tl instanceof BAO){
                tl.XUAT();
            }else{
                System.out.println("Không tìm thấy tài liệu!");
            }
        }
    }
    public void hienThiDanhSach(){
        for (TAILIEU taiLieu : danhSachTaiLieu118) {
            taiLieu.XUAT();
        }
    }
}
