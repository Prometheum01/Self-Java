package dataAccess.category_dao;

import entities.concretes.Category;

public class CategoryHibernate implements CategoryDao {
    @Override
    public void addCategory(Category category) {
        System.out.println("Category added used Hibernate Database system.");
    }

}
