package BAI1;

public class PHANSO {
    private int tu118;
    private int mau118;
    public PHANSO(int tu, int mau) {
        this.tu118 = tu;
        if (mau == 0) {
            throw new IllegalArgumentException("Mẫu số không được bằng 0");
        }
        this.mau118 = mau;
    }
    public PHANSO() {
    }
    public int getTu() {
        return tu118;
    }
    public int getMau() {
        return mau118;
    }
    public void setTu(int tu) {
        this.tu118 = tu;
    }
    public void setMau(int mau) {
        this.mau118 = mau;
    }
    private int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public PHANSO rutGon() {
        int ucln = UCLN(tu118, mau118);
        if (ucln != 0) {
            tu118 /= ucln;
            mau118 /= ucln;
        }
        if (mau118 < 0) {
            tu118 = -tu118;
            mau118 = -mau118;
        }
        return new PHANSO(tu118, mau118);
    }
    
    public boolean laToiGian() {
        return UCLN(tu118, mau118) == 1;
    }
    public PHANSO cong(PHANSO ps) {
        int tuMoi = this.tu118 * ps.mau118 + ps.tu118 * this.mau118;
        int mauMoi = this.mau118 * ps.mau118;
        return new PHANSO(tuMoi, mauMoi).rutGon();
    }
    public PHANSO tru(PHANSO ps) {
        int tuMoi = this.tu118 * ps.mau118 - ps.tu118 * this.mau118;
        int mauMoi = this.mau118 * ps.mau118;
        return new PHANSO(tuMoi, mauMoi).rutGon();
    }
    public PHANSO nhan(PHANSO ps) {
        int tuMoi = this.tu118 * ps.tu118;
        int mauMoi = this.mau118 * ps.mau118;
        return new PHANSO(tuMoi, mauMoi).rutGon();
    }
    public PHANSO chia(PHANSO ps) {
        if (ps.tu118 == 0) {
            throw new IllegalArgumentException("Không thể chia cho phân số có tử số bằng 0");
        }
        int tuMoi = this.tu118 * ps.mau118;
        int mauMoi = this.mau118 * ps.tu118;
        return new PHANSO(tuMoi, mauMoi).rutGon();
    }
    @Override
    public String toString() {
        if (mau118 == 1) {
            return Integer.toString(tu118);
        } else if (mau118 == -1) {
            return Integer.toString(-tu118);
        } else {
            return tu118 + "/" + mau118;
        }
    }
}
