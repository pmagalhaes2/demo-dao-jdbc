package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entitites.Department;
import model.entitites.Seller;

import java.text.ParseException;
import java.util.List;

public class Program {
    public static void main(String[] args) throws ParseException {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== TEST 1: Seller FindById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n==== TEST 2: Seller FindByDepartment ====");
        Department department = new Department(2, null);
        List<Seller> sellerList = sellerDao.findByDepartment(department);
        for(Seller s: sellerList) {
            System.out.println(s);
        }

        System.out.println("\n==== TEST 3: Seller FindAll ====");
        sellerList = sellerDao.findAll();
        for(Seller s: sellerList) {
            System.out.println(s);
        }
    }
}
