package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entitites.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== TEST 1: Department FindById ====");
        Department department = departmentDao.findById(4);
        System.out.println(department);

        System.out.println("\n==== TEST 2: Department FindAll ====");
        List<Department> departmentList = departmentDao.findAll();
        for (Department d : departmentList) {
            System.out.println(d);
        }

        System.out.println("\n==== TEST 3: Seller Insert ====");
        Department newDepartment = new Department(null, "Food");
        departmentDao.insert(newDepartment);
        System.out.println(STR."Inserted! New id = \{newDepartment.getId()}");

        System.out.println("\n==== TEST 4: Department Update ====");
        department = departmentDao.findById(9);
        department.setName("Music");
        departmentDao.update(department);
        System.out.println("Update completed");

        System.out.println("\n==== TEST 5: Seller Delete ====");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }
}
