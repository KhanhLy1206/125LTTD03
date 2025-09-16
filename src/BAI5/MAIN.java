package BAI5;

public class MAIN {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        QLKP qlkp = new QLKP();
        qlkp.nhapHoDan(sc);
        System.out.println("Danh sách hộ dân trong khu phố:");
        qlkp.xuatDanhSach();
        System.out.println("Tìm kiếm thông tin người 80 tuổi:");
        qlkp.timKiemThongTin();
        sc.close();
    }
}
