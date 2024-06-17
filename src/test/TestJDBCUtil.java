package test;

import java.sql.Connection;
import database.JDBCUtil;
import java.sql.Statement;
import java.sql.SQLException;


public class TestJDBCUtil {

    public static void main(String[] args) {
        try {
        // bước 1: tạo kết nối
            Connection connection = JDBCUtil.getConnection();

            //bước 2: Tạo ra đối tượng statement
            Statement st = connection.createStatement();

        // bước 3: thực thi một câu lệnh SQL

            String sql = "Insert into NhanVien(maNV, tenNV, ngaySinh, gioiTinh, sdt, diaChi, taiKhoan, matKhau)" + "values" + "(\'111\', \'Hinh\',\'09/09/1998\', \'Nam\', \'4567897\', \'23 Quang Trung\', \'Quang98\', \'12345\')";

            int check = st.executeUpdate(sql);
            
        // bước 4: xử lý kết quả
            
            System.out.println("số dòng thay đổi: "+check);
            if (check > 0){
                System.out.println("Thêm dữ liệu thành công");
            }else {
                System.out.println("Thêm dữ liệu thất bại");
            }
        // bước 5: ngắt kết nối
            JDBCUtil.closeConnection(connection);
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
