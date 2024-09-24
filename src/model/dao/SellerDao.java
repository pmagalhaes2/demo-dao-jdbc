package model.dao;

import db.DbException;
import model.entitites.Department;
import model.entitites.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);

    void update(Seller obj);

    void deleteById(Integer id);

    Seller findById(Integer id);

    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
