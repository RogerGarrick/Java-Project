package database;

import java.sql.Connection;
import java.sql.*;

public class JDBCUtil {

    public static Connection getConnection() {

        Connection c = null;
        var server = "DESKTOP-4D7VCS3";
        var username = "sa";
        var password = "123";
        var dbname = "QLNV";
        var port = 1433;
        try {

            // Đăng ký SQL Server với DriverManager
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());

            // Các thông số
            String url = "jdbc:sqlserver://"
                    + server + ":"
                    + port + ";databaseName="
                    + dbname + ";trustServerCertificate=true";

            // Tạo kết nối
            c = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return c;

    }

    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printInfo(Connection c) {
        try {
            if (c != null) {
                DatabaseMetaData mtdt = c.getMetaData();
                System.out.print(mtdt.getDatabaseProductName());
                System.out.print(mtdt.getDatabaseProductVersion());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
