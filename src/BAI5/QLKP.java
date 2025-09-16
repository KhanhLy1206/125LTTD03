package BAI5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class QLKP {
    private ArrayList<HODAN> dsKhuPho118;

    public QLKP() {
        dsKhuPho118 = new ArrayList<>();
    }

    public void themHoDan(HODAN hoDan) {
        dsKhuPho118.add(hoDan);
    }

    public void nhapHoDan(Scanner sc) {
        System.out.print("Nhập số hộ dân: ");
        int soHoDan = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập thông tin các hộ dân:");
        for (int i = 0; i < soHoDan; i++) {
            System.out.println("Nhập thông tin hộ dân thứ " + (i + 1) + ":");
            HODAN h = new HODAN();
            h.NHAP(sc);
            themHoDan(h);
        }
    }

    public void xuatDanhSach() {
        for (int i = 0; i < dsKhuPho118.size(); i++) {
            System.out.println("Thông tin hộ dân thứ " + (i + 1) + ":");
            dsKhuPho118.get(i).XUAT();
        }
    }

    public void timKiemThongTin() {
        Date now = new Date();
        int namHienTai = now.getYear() + 1900;

        for (HODAN hd : dsKhuPho118) {
            NGUOI[] dstv = hd.getDs118(); // lấy danh sách thành viên
            for (int i = 0; i < hd.getSoNguoi118(); i++) { // duyệt số người
                Date ns = dstv[i].getNgaySinh118();
                if (ns != null) {
                    int namSinh = ns.getYear() + 1900;
                    int tuoi = namHienTai - namSinh;
                    if (tuoi == 80) {
                        System.out.println("👉 Thông tin người 80 tuổi trong hộ số " + hd.getSoNha118() + ":");
                        dstv[i].XUAT();
                    }
                    else {
                        System.out.println("Không có người 80 tuổi trong hộ số " + hd.getSoNha118());
                    }
                }
            }
        }
    }

}
