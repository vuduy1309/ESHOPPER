import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import dal.ProductDAO;
import model.Product;
import java.util.Vector;

public class ProductDAOTest {

    private ProductDAO productDAO;

    @BeforeEach
    public void setUp() {
        productDAO = new ProductDAO();
    }

    @Test
    public void testGetAll() {
        Vector<Product> result = productDAO.getAll();

        assertNotNull(result, "The result should not be null");
        assertTrue(result.size() > 0, "The result should contain at least one product");

        Product firstProduct = result.get(0);
        assertNotNull(firstProduct.getName(), "The product name should not be null");
        assertTrue(firstProduct.getPrice() > 0, "The product price should be greater than 0");
        assertNotNull(firstProduct.getRelease_date(), "The product release date should not be null");
    }
}
