package BAI5;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class NGUOI {
    private String hoTen118;
    private Date ngaySinh118;
    private String ngheNghiep118;
    public NGUOI() {
    }
    public NGUOI(String hoTen118, Date ngaySinh118, String ngheNghiep118) {
        this.hoTen118 = hoTen118;
        this.ngaySinh118 = ngaySinh118;
        this.ngheNghiep118 = ngheNghiep118;
    }
    public String getHoTen118() {
        return hoTen118;
    }
    public void setHoTen118(String hoTen118) {
        this.hoTen118 = hoTen118;
    }
    public Date getNgaySinh118() {
        return ngaySinh118;
    }
    public void setNgaySinh118(Date ngaySinh118) {
        this.ngaySinh118 = ngaySinh118;
    }
    public String getNgheNghiep118() {
        return ngheNghiep118;
    }
    public void setNgheNghiep118(String ngheNghiep118) {
        this.ngheNghiep118 = ngheNghiep118;
    }
    private Date StrToDate(String strDate){
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            date = sdf.parse(strDate);
            return date;
        }catch (ParseException e){
            System.out.println("Lỗi định dạng ngày tháng!");
        }
        return date;
    }
    public void NHAP(Scanner sc){
        System.out.print("Nhap ho ten: ");
        hoTen118 = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        String StrDate = sc.nextLine();
        ngaySinh118 = StrToDate(StrDate);
        System.out.print("Nhap nghe nghiep: ");
        ngheNghiep118 = sc.nextLine();
    }
    public void XUAT(){
        System.out.println("Ho ten: " + hoTen118);
        System.out.println("Ngay sinh: " + dateToString(ngaySinh118));
        System.out.println("Nghe nghiep: " + ngheNghiep118);
    }
    private String dateToString(Date date ) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = sdf.format(date);
        return strDate;
    }
}
