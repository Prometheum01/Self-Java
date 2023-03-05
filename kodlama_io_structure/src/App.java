import business.CategoryManager;
import dataAccess.category_dao.CategoryJdbc;
import entities.concretes.Category;

public class App {
    public static void main(String[] args) throws Exception {
        Category category = new Category(0, "Java");

        CategoryManager categoryManager = new CategoryManager(new CategoryJdbc());

        categoryManager.addCategory(category);
    }
}
