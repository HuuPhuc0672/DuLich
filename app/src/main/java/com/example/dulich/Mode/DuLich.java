package com.example.dulich.Mode;

import java.io.Serializable;

public class DuLich implements Serializable {


  private String HinhAnhDL,TenDL,ThongTinDl1,HAnh1,ThongTinDl2;

    public DuLich() {
    }

    public DuLich(String hinhAnhDL, String tenDL, String thongTinDl1, String HAnh1, String thongTinDl2) {
        HinhAnhDL = hinhAnhDL;
        TenDL = tenDL;
        ThongTinDl1 = thongTinDl1;
        this.HAnh1 = HAnh1;
        ThongTinDl2 = thongTinDl2;
    }

    public String getHinhAnhDL() {
        return HinhAnhDL;
    }

    public void setHinhAnhDL(String hinhAnhDL) {
        HinhAnhDL = hinhAnhDL;
    }

    public String getTenDL() {
        return TenDL;
    }

    public void setTenDL(String tenDL) {
        TenDL = tenDL;
    }

    public String getThongTinDl1() {
        return ThongTinDl1;
    }

    public void setThongTinDl1(String thongTinDl1) {
        ThongTinDl1 = thongTinDl1;
    }

    public String getHAnh1() {
        return HAnh1;
    }

    public void setHAnh1(String HAnh1) {
        this.HAnh1 = HAnh1;
    }

    public String getThongTinDl2() {
        return ThongTinDl2;
    }

    public void setThongTinDl2(String thongTinDl2) {
        ThongTinDl2 = thongTinDl2;
    }
}
