package BAI9;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class SINHVIEN {
    private String hoVaTen118;
    private String maSV118;
    private Date ngaySinh118;
    private String lop118;
    public  SINHVIEN(){}

    public SINHVIEN(String hoVaTen118, String maSV118, Date ngaySinh118, String lop118) {
        this.hoVaTen118 = hoVaTen118;
        this.maSV118 = maSV118;
        this.ngaySinh118 = ngaySinh118;
        this.lop118 = lop118;
    }
    public String getHoVaTen118() {
        return hoVaTen118;
    }
    public void setHoVaTen118(String hoVaTen118) {
        this.hoVaTen118 = hoVaTen118;
    }
    public String getMaSV118() {
        return maSV118;
    }
    public void setMaSV118(String maSV118) {
        this.maSV118 = maSV118;
    }
    public Date getNgaySinh118() {
        return ngaySinh118;
    }
    public void setNgaySinh118(Date ngaySinh118) {
        this.ngaySinh118 = ngaySinh118;
    }
    public String getLop118() {
        return lop118;
    }
    public void setLop118(String lop118) {
        this.lop118 = lop118;
    };
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
        
        System.out.println("Nhập họ và tên: ");
        hoVaTen118=sc.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        maSV118=sc.nextLine();
        System.out.println("Nhập ngày sinh (dd/MM/yyyy): ");
        String StrDate = sc.nextLine();
        ngaySinh118 = StrToDate(StrDate);
        System.out.println("Nhập lớp: ");
        lop118=sc.nextLine();
    }
    public void XUAT(){
        
        System.out.println("Họ và tên: "+hoVaTen118);
        System.out.println("MÃ sinh viên: "+maSV118);
        System.out.println("Ngày sinh: "+dateToString(ngaySinh118));
        System.out.println("Lớp: "+lop118);
    }
}
