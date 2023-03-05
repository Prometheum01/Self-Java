package business;

import dataAccess.category_dao.CategoryDao;
import entities.concretes.Category;

public class CategoryManager {
    private CategoryDao categoryDao;

    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    public void addCategory(Category category) throws Exception {

        if (category.getCategoryName().isEmpty() || category.getCategoryName() == "Before Category Names") {
            throw new Exception("Category name have to be unique!");
        }

        categoryDao.addCategory(category);

    }

}
