package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entitites.Seller;

import java.text.ParseException;

public class Program {
    public static void main(String[] args) throws ParseException {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== TEST 1: Seller FindById ====");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
