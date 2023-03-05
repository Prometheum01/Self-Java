package dataAccess.category_dao;

import entities.concretes.Category;

public class CategoryJdbc implements CategoryDao {

    @Override
    public void addCategory(Category category) {
        System.out.println("Category added used Jdbc Database system.");
    }

}
