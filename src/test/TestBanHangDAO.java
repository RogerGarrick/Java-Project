
package test;

import DAO.BanHangDAO;
import Model.BanHang;
import java.util.ArrayList;

public class TestBanHangDAO {
    public static void main(String[] args) {
        ArrayList<BanHang> list = BanHangDAO.getInstance().selectAll();
        for (BanHang banhang : list) {
            System.out.println(banhang.toString());
        }
    }
    
    
}
