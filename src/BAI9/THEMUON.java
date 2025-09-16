package BAI9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class THEMUON extends SINHVIEN {
    protected int soPM118;
    protected Date ngayMuon118;
    protected Date hanTra118;
    protected String soHieu118;

    // Constructor mặc định
    public THEMUON() {
    }

    // Constructor đầy đủ
    public THEMUON(String hoVaTen118, String maSV118, Date ngaySinh118, String lop118,
            int soPM118, Date ngayMuon118, Date hanTra118, String soHieu118) {
        super(hoVaTen118, maSV118, ngaySinh118, lop118);
        this.soPM118 = soPM118;
        this.ngayMuon118 = ngayMuon118;
        this.hanTra118 = hanTra118;
        this.soHieu118 = soHieu118;
    }

    // Getter & Setter
    public int getSoPM118() {
        return soPM118;
    }

    public void setSoPM118(int soPM118) {
        this.soPM118 = soPM118;
    }

    public Date getNgayMuon118() {
        return ngayMuon118;
    }

    public void setNgayMuon118(Date ngayMuon118) {
        this.ngayMuon118 = ngayMuon118;
    }

    public Date getHanTra118() {
        return hanTra118;
    }

    public void setHanTra118(Date hanTra118) {
        this.hanTra118 = hanTra118;
    }

    public String getSoHieu118() {
        return soHieu118;
    }

    public void setSoHieu118(String soHieu118) {
        this.soHieu118 = soHieu118;
    }

    // Chuyển String → Date
    private Date StrToDate(String strDate) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = sdf.parse(strDate);
            return date;
        } catch (ParseException e) {
            System.out.println("Lỗi định dạng ngày tháng!");
        }
        return date;
    }

    // Chuyển Date → String
    private String dateToString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

    // Nhập dữ liệu thẻ mượn
    @Override
    public void NHAP(Scanner sc) {
        super.NHAP(sc);
        System.out.print("Nhập mã số phiếu mượn: ");
        soPM118 = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập ngày mượn (dd/MM/yyyy): ");
        String StrDate = sc.nextLine();
        ngayMuon118 = StrToDate(StrDate);
        System.out.print("Nhập ngày trả (dd/MM/yyyy): ");
        String StrDate1 = sc.nextLine();
        hanTra118 = StrToDate(StrDate1);
        System.out.print("Nhập số hiệu sách: ");
        soHieu118 = sc.nextLine();
    }

    // Xuất dữ liệu thẻ mượn
    @Override
    public void XUAT() {
        super.XUAT();
        System.out.println("Mã số phiếu mượn: " + soPM118);
        System.out.println("Ngày mượn: " + dateToString(ngayMuon118));
        System.out.println("Ngày trả: " + dateToString(hanTra118));
        System.out.println("Số hiệu sách: " + soHieu118);
        System.out.println("-----------------------------------");
    }
}
