
package Model;


public class BanHang {
    
    private int ban;
    private String tennuoc;
    private int soluong;
    private String thanhtien;

    public BanHang() {
        super();
    }

    public BanHang(int ban, String tennuoc, int soluong, String thanhtien) {
        super();
        this.setBan(ban);
        this.setTennuoc(tennuoc);
        this.setSoluong(soluong);
        this.setThanhtien(thanhtien);
    }

    public int getBan() {
        return ban;
    }

    public String getTennuoc() {
        return tennuoc;
    }

    public int getSoluong() {
        return soluong;
    }

    public String getThanhtien() {
        return thanhtien;
    }

    public final void setBan(int ban) {
        this.ban = ban;
    }

    public final void setTennuoc(String tennuoc) {
        this.tennuoc = tennuoc;
    }

    public final void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public final void setThanhtien(String thanhtien) {
        this.thanhtien = thanhtien;
    }

    @Override
    public String toString() {
        return "BanHang{" 
                + "ban=" + ban 
                + ", tennuoc=" + tennuoc 
                + ", soluong=" + soluong 
                + ", thanhtien=" + thanhtien + '}';
    }
    
    
    
}
