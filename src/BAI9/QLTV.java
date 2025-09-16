package BAI9;
import java.util.Scanner;
import java.util.ArrayList;;
public class QLTV {
    private ArrayList<THEMUON> ds118;

    public QLTV(ArrayList<THEMUON> ds118) {
        this.ds118 = ds118;
    }
    public QLTV(){
        ds118=new ArrayList<>();
    };
    public void themTheMuon(THEMUON tm){
        ds118.add(tm);
    }
    public void nhapDSTM(Scanner sc){
        THEMUON tm;
        int n;
        do {
            System.out.println("Nhập vào số lượng thẻ muốn mượn: ");
            n=sc.nextInt();
            sc.nextLine();
        } while (n<=0);
        for(int i=0;i<n;i++){
            System.out.println("Nhập thông tin thẻ mượn thứ "+(i+1)+": ");
            tm=new THEMUON();
            tm.NHAP(sc);
            ds118.add(tm);

        }
    }
    public void xuatDSTM(){
        for(THEMUON tm: ds118){
            tm.XUAT();
            System.out.println("-------------------------");
        }
    }
    public void hienThiDSTraCuoiThang(){
        for(THEMUON tm:ds118){
            if(tm.getHanTra118().getDate()==31||tm.getHanTra118().getDate()==30)
            System.out.println("Những thẻ có ngày trả cuối tháng là: ");
            tm.XUAT();}
    }
}
