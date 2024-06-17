
package DAO;
import Model.BanHang;
import database.JDBCUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BanHangDAO implements DAOInterface<BanHang> {
    
    public static BanHangDAO getInstance(){
        return new BanHangDAO();
    }

    @Override
    public int insert(BanHang t) {
        int ketQua = 0;

        try {
            // bước 1:  tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: thực thi câu lệnh SQL
            String sql = "Insert into NhanVien(maNV, tenNV, ngaySinh, gioiTinh, sdt, diaChi, taiKhoan, matKhau)"
                    + "values ('" 
                    + t.getBan() + "', '" 
                    + t.getTennuoc() + "', '" 
                    + t.getSoluong() + "', '" 
                    + t.getThanhtien()+"')";

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
    public int update(BanHang t) {
       int ketQua = 0;

        try {
            // bước 1:  tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: thực thi câu lệnh SQL
            String sql = "update BanHang"
                    + "set" 
                    + t.getBan() + "', '" 
                    + t.getTennuoc() + "', '" 
                    + t.getSoluong() + "', '" 
                    + t.getThanhtien()+"')";

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
    public int delete(BanHang t) {
      int ketQua = 0;

        try {
            // bước 1:  tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: thực thi câu lệnh SQL
            String sql = " Delete from BanHang "                    
                    + " where ban = '" + t.getBan() + "'";
            
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
    public ArrayList<BanHang> selectAll() {
      ArrayList<BanHang> ketQua = new ArrayList<BanHang>();

        try {
            // bước 1:  tạo kết nối đến CSDL
            Connection con = JDBCUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            Statement st = con.createStatement();

            // Bước 3: thực thi câu lệnh SQL
            String sql = "select * from BanHang";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            // Bước 4: xử lý kết quả
            while (rs.next()) {
                int ban = rs.getInt("ban");
                String tenNuoc = rs.getString("tenNuoc");
                int soLuong = rs.getInt("soLuong");
                String thanhTien = rs.getString("thanhTien");
           
                BanHang banhang = new BanHang(ban, tenNuoc, soLuong, thanhTien);
                ketQua.add(banhang);
            }

            // Bước 5: ngắt kết nối
            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public BanHang selectById(BanHang t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<BanHang> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
