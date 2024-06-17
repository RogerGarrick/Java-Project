
package Model;


public class NhanVien {
    
    private String manv;
    private String tennv;
    private String ngaysinh;
    private String gioitinh;
    private String sdt;
    private String diachi;
    private String taikhoan;
    private String matkhau;

    public NhanVien() {
        super();
    }

    
    public NhanVien(String manv, String tennv, String ngaysinh, String gioitinh, String sdt, String diachi, String taikhoan, String matkhau) {
        super();
        this.setManv(manv);
        this.setTennv(tennv);
        this.setNgaysinh(ngaysinh);
        this.setGioitinh(gioitinh);
        this.setSdt(sdt);
        this.setDiachi(diachi);
        this.setTaikhoan(taikhoan);
        this.setMatkhau(matkhau);
    }

    public String getManv() {
        return manv;
    }

    public String getTennv() {
        return tennv;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getSdt() {
        return sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public final void setManv(String manv) {
        this.manv = manv;
    }

    public final void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public final void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public final void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public final void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public final void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public final void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public final void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    @Override
    public String toString() {
        return "NhanVien{" 
                + "manv=" + manv 
                + ", tennv=" + tennv 
                + ", ngaysinh=" + ngaysinh 
                + ", gioitinh=" + gioitinh 
                + ", sdt=" + sdt 
                + ", diachi=" + diachi 
                + ", taikhoan=" + taikhoan + ", matkhau=" + matkhau + '}';
    }
    
  
    
}
