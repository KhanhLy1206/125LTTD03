package BAI6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NGUOI {
    protected String hoVaTen118;
    protected Date ngaySinh118;
    protected String soCMND118;
    public NGUOI(){}
    public NGUOI(String hoVaTen, Date ngaySinh, String soCMND) {
        this.hoVaTen118 = hoVaTen;
        this.ngaySinh118 = ngaySinh;
        this.soCMND118 = soCMND;
    }
    public String getHoVaTen118() {
        return hoVaTen118;
    }
    public void setHoVaTen118(String hoVaTen) {
        this.hoVaTen118 = hoVaTen;
    }
    public Date getNgaySinh118() {
        return ngaySinh118;
    }
    public void setNgaySinh118(Date ngaySinh) {
        this.ngaySinh118 = ngaySinh;
    }
    public String getSoCMND118() {
        return soCMND118;
    }
    public void setSoCMND118(String soCMND) {
        this.soCMND118 = soCMND;
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
    
    private String dateToString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = sdf.format(date);
        return strDate;
    }
    public void NHAP(Scanner sc){
        System.out.println("Nhập họ và tên khách thuê: ");
        hoVaTen118=sc.nextLine();
        System.out.println("Nhập ngày sinh (dd/MM/yyyy): ");
        String StrDate = sc.nextLine();
        ngaySinh118 = StrToDate(StrDate);
        System.out.println("Nhập số CMND: ");
        soCMND118=sc.nextLine();
    }
    public void XUAT(){
        System.out.println("Họ và tên khách thuê: " + hoVaTen118);
        System.out.println("Ngày sinh: " + dateToString(ngaySinh118));
        System.out.println("Số CMND: " + soCMND118);
    }
}
