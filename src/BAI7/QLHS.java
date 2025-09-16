package BAI7;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
    private ArrayList<HOCSINH> dSHocSinh118;
    public QLHS(){
        dSHocSinh118 = new ArrayList<>();
    }
    public void themHocSinh(HOCSINH hs){
        dSHocSinh118.add(hs);
    }
    public void nhapDSHS(Scanner sc){
        HOCSINH hs = new HOCSINH();
        int n;
        do{
            System.out.println("Nhập số học sinh: ");
            n = Integer.parseInt(sc.nextLine());
        }while(n <= 0);
        for(int i = 0; i < n; i++){
            System.out.println("Nhập thông tin học sinh thứ " + (i+1) + ": ");
            hs = new HOCSINH();
            hs.NHAP(sc);
            themHocSinh(hs);
        }
    }
    public void xuatDSHS( ){
        for(HOCSINH hs:dSHocSinh118){
            hs.XUAT();
            System.out.println("---------------");
        }
    }
    public void timKiemHS(){
        for(HOCSINH hs: dSHocSinh118){
            if((hs.getNgaySinh118().getYear()+1900==1985)&& (hs.getQueQuan118().equals("Thái Nguyên"))){
        
                System.out.println("Thông tin học sinh sinh năm 1985 và quê ở Thái Nguyên: ");
                hs.XUAT();
                System.out.println("---------------");
            }else{
                System.out.println("Không có học sinh nào sinh năm 1985 và quê ở Thái Nguyên");
            }
        }
    }
    public void timKiemHS10A1(){
        for(HOCSINH hs: dSHocSinh118){
            if(hs.getLop118().equals("10A1")){
                System.out.println("Thông tin học sinh lớp 10A1: ");
                hs.XUAT();
                System.out.println("---------------");
            }
            else{
                System.out.println("Không có học sinh nào lớp 10A1");
            }
        }
    }
}
