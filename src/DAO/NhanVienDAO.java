package DAO;

import Model.NhanVien;
import database.JDBCUtil;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Date;

public class NhanVienDAO implements DAOInterface<NhanVien> {

    public static NhanVienDAO getInstance() {
        return new NhanVienDAO();
    }

    @Override
    public int insert(NhanVien t) {

        int ketQua = 0;

        try {
            // bước 1:  tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: thực thi câu lệnh SQL
            String sql = "Insert into NhanVien(maNV, tenNV, ngaySinh, gioiTinh, sdt, diaChi, taiKhoan, matKhau)"
                    + "values ('" 
                    + t.getManv() + "', '"
                    + t.getTennv() + "', '"
                    + t.getNgaysinh() + "', '"
                    + t.getGioitinh() + "', '"
                    + t.getSdt() + "', '"
                    + t.getDiachi() + "', '"
                    + t.getTaikhoan() + "', '"
                    + t.getMatkhau() + "')";

            ketQua = st.executeUpdate(sql);

            // Bước 4: xử lý kết quả
            System.out.println("Bạn đã thực thi:" + sql);
            System.out.println(" Có " + ketQua + " dòng bị thay đổi! ");

            // Bước 5: ngắt kết nối
            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(NhanVien t) {
        int ketQua = 0;

        try {
            // bước 1:  tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: thực thi câu lệnh SQL
            String sql = " Update NhanVien "
                    + " set "
                    + "tenNV = '" + t.getTennv() + "' "
                    + ", ngaySinh = '" + t.getNgaysinh() + "' "
                    + ", gioiTinh = '" + t.getGioitinh() + "' "
                    + ", sdt = '" + t.getSdt() + "' "
                    + ", diaChi = '" + t.getDiachi() + "' "
                    + ", taiKhoan = '" + t.getTaikhoan() + "' "
                    + ", matKhau = '" + t.getMatkhau() + "' "
                    + " where maNV = '" + t.getManv() + "'";

            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            // Bước 4: xử lý kết quả
            System.out.println("Bạn đã thực thi:" + sql);
            System.out.println(" Có " + ketQua + " dòng bị thay đổi! ");

            // Bước 5: ngắt kết nối
            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int delete(NhanVien t) {
        int ketQua = 0;

        try {
            // bước 1:  tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: thực thi câu lệnh SQL
            String sql = " Delete from NhanVien "
                    + " where maNV = '" + t.getManv() + "'";

            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            // Bước 4: xử lý kết quả
            System.out.println("Bạn đã thực thi:" + sql);
            System.out.println(" Có " + ketQua + " dòng bị thay đổi! ");

            // Bước 5: ngắt kết nối
            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<NhanVien> selectAll() {

        ArrayList<NhanVien> ketQua = new ArrayList<NhanVien>();

        try {
            // bước 1:  tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: thực thi câu lệnh SQL
            String sql = "select * from NhanVien";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            // Bước 4: xử lý kết quả
            while (rs.next()) {
                String maNV = rs.getString("maNV");
                String tenNV = rs.getString("tenNV");
                String ngaySinh = rs.getString("ngaySinh");
                String gioiTinh = rs.getString("gioiTinh");
                String sdt = rs.getString("sdt");
                String diaChi = rs.getString("diaChi");
                String taiKhoan = rs.getString("taiKhoan");
                String matKhau = rs.getString("matKhau");

                NhanVien nhanvien = new NhanVien(maNV, tenNV, ngaySinh, gioiTinh, sdt, diaChi, taiKhoan, matKhau);
                ketQua.add(nhanvien);
            }

            // Bước 5: ngắt kết nối
            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public NhanVien selectById(NhanVien t) {
       NhanVien ketQua = null;

        try {
            // bước 1:  tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: thực thi câu lệnh SQL
            String sql = "select * from NhanVien where maNV = '"+t.getManv()+"'";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            // Bước 4: xử lý kết quả
            while (rs.next()) {
                String maNV = rs.getString("maNV");
                String tenNV = rs.getString("tenNV");
                String ngaySinh = rs.getString("ngaySinh");
                String gioiTinh = rs.getString("gioiTinh");
                String sdt = rs.getString("sdt");
                String diaChi = rs.getString("diaChi");
                String taiKhoan = rs.getString("taiKhoan");
                String matKhau = rs.getString("matKhau");

                ketQua = new NhanVien(maNV, tenNV, ngaySinh, gioiTinh, sdt, diaChi, taiKhoan, matKhau);
                
            }

            // Bước 5: ngắt kết nối
            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<NhanVien> selectByCondition(String condition) {
           ArrayList<NhanVien> ketQua = new ArrayList<NhanVien>();

        try {
            // bước 1:  tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: thực thi câu lệnh SQL
            String sql = "select * from NhanVien where " + condition;
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            // Bước 4: xử lý kết quả
            while (rs.next()) {
                String maNV = rs.getString("maNV");
                String tenNV = rs.getString("tenNV");
                String ngaySinh = rs.getString("ngaySinh");
                String gioiTinh = rs.getString("gioiTinh");
                String sdt = rs.getString("sdt");
                String diaChi = rs.getString("diaChi");
                String taiKhoan = rs.getString("taiKhoan");
                String matKhau = rs.getString("matKhau");

                NhanVien nhanvien = new NhanVien(maNV, tenNV, ngaySinh, gioiTinh, sdt, diaChi, taiKhoan, matKhau);
                ketQua.add(nhanvien);
            }

            // Bước 5: ngắt kết nối
            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

}
