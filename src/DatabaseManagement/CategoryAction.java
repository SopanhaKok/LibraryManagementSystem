package DatabaseManagement;

import java.sql.*;
import DatabaseConfig.DatabaseConfig;
import Data.Category;

public class CategoryAction {
    public Category getCategoryById(int categoryId){
        Category category = null;
        try
        {
            Connection conn = DatabaseConfig.Connection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM book_categories WHERE category_id = ?");
            stmt.setInt(1, categoryId);
            ResultSet rs = stmt.executeQuery();
            //iterate through result
            while(rs.next())
            {
                category = new Category(rs.getInt("category_id"), rs.getString("category_name"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return category;
    }
}
