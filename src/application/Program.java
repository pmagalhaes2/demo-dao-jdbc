package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entitites.Department;
import model.entitites.Seller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

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

        System.out.println("\n==== TEST 4: Seller Insert ====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println(STR."Inserted! New id = \{newSeller.getId()}");

        System.out.println("\n==== TEST 5: Seller Update ====");
        seller = sellerDao.findById(1);
        seller.setName("Bob Billie");
        sellerDao.update(seller);
        System.out.println("Update completed");


        System.out.println("\n==== TEST 6: Seller Delete ====");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }
}
