package BAI1;
import java.util.Scanner;
public class MAIN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập tử số phân số 1: ");
        int tu1=sc.nextInt();
        System.out.print("Nhập mẫu số phân số 1: ");
        int mau1=sc.nextInt();
        PHANSO ps1=new PHANSO(tu1,mau1);
        System.out.print("Nhập tử số phân số 2: ");
        int tu2=sc.nextInt();
        System.out.print("Nhập mẫu số phân số 2: ");
        int mau2=sc.nextInt();
        PHANSO ps2=new PHANSO(tu2,mau2);
        System.out.println("Phân số 1 rút gọn là: "+ps1.rutGon());
        System.out.println("Phân số 2 rút gọn là: "+ps2.rutGon());
        PHANSO tong=ps1.cong(ps2);
        System.out.println("Tổng 2 phân số là: "+tong );
        PHANSO hieu=ps1.tru(ps2);
        System.out.println("Hiệu 2 phân số là: "+hieu);
        PHANSO tich=ps1.nhan(ps2);
        System.out.println("Tích 2 phân số là: "+tich);
        PHANSO thuong=ps1.chia(ps2);
        System.out.println("Thương 2 phân số là: "+thuong);
        if (ps1.laToiGian()){
            System.out.println("Phân số 1 là phân số tối giản");
        } else {
            System.out.println("Phân số 1 không phải là phân số tối giản");
        }
        if (ps2.laToiGian()){
            System.out.println("Phân số 2 là phân số tối giản");
        } else {
            System.out.println("Phân số 2 không phải là phân số tối giản");
        }
        sc.close();
    }
}
