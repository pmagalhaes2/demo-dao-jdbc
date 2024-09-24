package application;

import model.entitites.Department;
import model.entitites.Seller;

import java.text.ParseException;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {

        Department obj = new Department(1, "Books");
        Seller seller = new Seller(1, "Bob Purple", "bob.purple@email.com", new Date(),
                2000.00, obj);

        System.out.println(seller);
    }
}
