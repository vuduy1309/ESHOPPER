import dal.OrderDetailDAO;
import model.Order;
import model.CartItem;
import model.OrderDetail;
import model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderDetailDAOTest {

    private OrderDetailDAO orderDetailDAO;
    private Order testOrder;
    private CartItem testCartItem;
    private Product testProduct;

    @BeforeEach
    public void setUp() {
        orderDetailDAO = new OrderDetailDAO();
        testOrder = new Order(1, new java.sql.Date(System.currentTimeMillis()), null);
        testProduct = new Product(1, 100, 1, "Test Product", "Product Description", "image_url", 19.99, new java.sql.Date(System.currentTimeMillis()));
        testCartItem = new CartItem(testProduct, 2);
    }

    @Test
    public void testInsertOrderDetail() {
        orderDetailDAO.insert(testOrder, testCartItem);
        OrderDetail insertedOrderDetail = orderDetailDAO.getOrderDetailByOrderId(testOrder.getId());
        assertNotNull(insertedOrderDetail);
        assertEquals(testOrder.getId(), insertedOrderDetail.getOrder());
        assertEquals(testCartItem.getQuantity(), insertedOrderDetail.getProduct_quantity());
        assertEquals(testProduct.getPrice(), insertedOrderDetail.getPrice());
    }
}
