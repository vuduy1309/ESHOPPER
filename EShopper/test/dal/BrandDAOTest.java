package dal;

import model.Brand;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

public class BrandDAOTest {

    private BrandDAO brandDAO;

    @BeforeEach
    public void setUp() {
        // Initialize the BrandDAO object
        brandDAO = new BrandDAO();
    }

    @AfterEach
    public void tearDown() {
        // Optional cleanup after tests, if necessary.
    }

    @Test
    public void testGetAll_ShouldReturnBrands() {
        Vector<Brand> brands = brandDAO.getAll();
        assertNotNull(brands, "The result should not be null.");
        assertTrue(brands.size() >= 6, "The result should contain at least 6 brands.");
        System.out.println("Retrieved brands:");
        for (Brand brand : brands) {
            System.out.println(brand.getName()); // Print the brand name to debug
        }

        boolean macbookFound = false;
        boolean dellFound = false;
        boolean lenovoFound = false;
        boolean asusFound = false;
        boolean acerFound = false;
        boolean galaxyBookFound = false;

        for (Brand brand : brands) {
            if ("Macbook (Apple)".equals(brand.getName())) {
                macbookFound = true;
            }
            if ("Dell".equals(brand.getName())) {
                dellFound = true;
            }
            if ("Lenovo".equals(brand.getName())) {
                lenovoFound = true;
            }
            if ("Asus".equals(brand.getName())) {
                asusFound = true;
            }
            if ("Acer".equals(brand.getName())) {
                acerFound = true;
            }
            if ("Galaxy Book (Samsung)".equals(brand.getName())) {
                galaxyBookFound = true;
            }
        }

        assertTrue(macbookFound, "Macbook (Apple) should be in the list.");
        assertTrue(dellFound, "Dell should be in the list.");
        assertTrue(lenovoFound, "Lenovo should be in the list.");
        assertTrue(asusFound, "Asus should be in the list.");
        assertTrue(acerFound, "Acer should be in the list.");
        assertTrue(galaxyBookFound, "Galaxy Book (Samsung) should be in the list.");
    }
}
