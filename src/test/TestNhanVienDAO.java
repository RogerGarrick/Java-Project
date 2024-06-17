package test;

import DAO.NhanVienDAO;
import Model.NhanVien;
import java.util.ArrayList;

public class TestNhanVienDAO {

    public static void main(String[] args) {

        /* test insert ......*/
 
        NhanVien nhanvien1 = new NhanVien("112", "Quang Trung","06/06/1997", "Nam", "0374974254", "212 thạnh", "Quang98", "1234");
        NhanVien nhanvien4 = new NhanVien("118", "Quang Trung","06/06/1997", "Nam", "0374974254", "212 thạnh", "Quang98", "1234");
    
        NhanVienDAO.getInstance().insert(nhanvien1);
        
        
//        for (int i = 0; i < 100; i++){
//            NhanVien nhanvien = new NhanVien("11"+i, "Quang Trung" + i,"06/06/1997", "Nam", "0374974254", "0"+i, "Quang9"+i, "12"+i);
//            NhanVienDAO.getInstance().insert(nhanvien);
//        }
//         
 /* test update*/
//        
//        NhanVien nhanvien2 = new NhanVien("111", "Can Gio","06/06/1997", "Nam", "0374974254", "212 thạnh", "Quang98", "1234");
//        NhanVienDAO.getInstance().update(nhanvien2);
//        
//        /* test delete */
//         for (int i = 0; i < 100; i++){
//        NhanVien nhanvien = new NhanVien("11"+i, "Quang Trung" + i,"06/06/1997", "Nam", "0374974254", "0"+i, "Quang9"+i, "12"+i);
//        NhanVienDAO.getInstance().delete(nhanvien);
//        }

//        /* test selectAll */
//        ArrayList<NhanVien> list = NhanVienDAO.getInstance().selectAll();
//        for (NhanVien nhanvien : list) {
//            System.out.println(nhanvien.toString());
//        }
//        
//        /* test selectById*/
//        System.out.println("------------------------------");
//        
//        NhanVien find = new NhanVien();
//        find.setManv("001");
//        
//        NhanVien nhanvien2 = NhanVienDAO.getInstance().selectById(find);
//        System.out.println(nhanvien2);
//        
//        
//        /* test selectByCondition*/
//        System.out.println("------------------------------");
//        
//        ArrayList<NhanVien> list2 = NhanVienDAO.getInstance().selectByCondition("maNV = '002'");
//        for (NhanVien nhanvien : list2) {
//            System.out.println(nhanvien.toString());
        }

    }

