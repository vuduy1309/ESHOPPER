import dal.OrderDAO;
import model.Order;
import model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderDAOTest {

    private OrderDAO orderDAO;
    private User testUser;
    private Order testOrder;

    @BeforeEach
    public void setUp() {
        // Set up user and order objects for testing
        testUser = new User(1, "testuser", "testpassword", "Test User", "testuser@example.com", "123456789", "123 Test Street", 1);
        testOrder = new Order(0, new java.sql.Date(System.currentTimeMillis()), testUser);
        orderDAO = new OrderDAO(); // Create an instance of OrderDAO
    }

    @Test
    public void testInsert() {
        System.out.println("testInsert");
        int result = orderDAO.insert(testOrder, testUser);
        assertTrue(result > 0, "Insert failed, generated ID should be greater than 0.");
        testOrder.setId(result);
        Order insertedOrder = orderDAO.getOrdersById(testOrder.getId());
        assertNotNull(insertedOrder, "Inserted order should not be null.");
        assertEquals(testOrder.getId(), insertedOrder.getId(), "Order ID mismatch.");
        assertEquals(testOrder.getUser().getId(), insertedOrder.getUser().getId(), "User ID mismatch.");
        assertEquals(testOrder.getCreated_date(), insertedOrder.getCreated_date(), "Created date mismatch.");
    }
}
