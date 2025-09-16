package BAI8;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NGUOI {
    private String hoVaTen118;
    private Date ngaySinh118;
    private String queQuan118;
    public NGUOI(){

    }
    public NGUOI(String hoVaTen118, Date ngaySinh118, String queQuan118) {
        this.hoVaTen118 = hoVaTen118;
        this.ngaySinh118 = ngaySinh118;
        this.queQuan118 = queQuan118;
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
    
    public String getHoVaTen118() {
        return hoVaTen118;
    }
    public void setHoVaTen118(String hoVaTen118) {
        this.hoVaTen118 = hoVaTen118;
    }
    public Date getNgaySinh118() {
        return ngaySinh118;
    }
    public void setNgaySinh118(Date ngaySinh118) {
        this.ngaySinh118 = ngaySinh118;
    }
    public String getQueQuan118() {
        return queQuan118;
    }
    public void setQueQuan118(String queQuan118) {
        this.queQuan118 = queQuan118;
    }
    private String dateToString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = sdf.format(date);
        return strDate;
    }
    public void NHAP(Scanner sc){
        System.out.println("Nhập họ và tên: ");
        hoVaTen118=sc.nextLine();
        System.out.println("Nhập ngày sinh (dd/MM/yyyy): ");
        String StrDate=sc.nextLine();
        ngaySinh118=StrToDate(StrDate);
        System.out.println("Nhập quê quán: ");
        queQuan118=sc.nextLine();
    }
    public void XUAT(){
        System.out.println("Họ và tên: "+hoVaTen118);
        System.out.println("Ngày sinh: "+dateToString(ngaySinh118));
        System.out.println("Quê quán: "+queQuan118);
    }
}
