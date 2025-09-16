package BAI10;

public class KHACHHANG {
    private String hoTen118;
    private String soNha118;
    private String maCongTo118;

    public KHACHHANG() {
    }

    public KHACHHANG(String hoTen118, String soNha118, String maCongTo118) {
        this.hoTen118 = hoTen118;
        this.soNha118 = soNha118;
        this.maCongTo118 = maCongTo118;
    }

    public String getHoTen118() {
        return hoTen118;
    }

    public void setHoTen118(String hoTen118) {
        this.hoTen118 = hoTen118;
    }

    public String getSoNha118() {
        return soNha118;
    }

    public void setSoNha118(String soNha118) {
        this.soNha118 = soNha118;
    }

    public String getMaCongTo118() {
        return maCongTo118;
    }

    public void setMaCongTo118(String maCongTo118) {
        this.maCongTo118 = maCongTo118;
    }

    public void XUAT() {
        System.out.println("Họ tên chủ hộ: " + hoTen118);
        System.out.println("Số nhà: " + soNha118);
        System.out.println("Mã công tơ: " + maCongTo118);
    }
}
