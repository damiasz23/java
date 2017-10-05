package shop;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductControllerTest {

    private ProductController productController;
    private ProducktRepository producktRepository;


    @Before
    public void initialize() {
        producktRepository = mock(ProducktRepository.class);
        productController = new ProductController();

        Product laptop = new Product(12, "laptop", 3000);
        Product telefon = new Product(23, "telefon", 1000);
        Product tv = new Product(34, "tv", 1200);

        when(producktRepository.getAllProducts()).thenReturn(Arrays.asList(laptop, telefon, tv));
    }
        @Test
    public void sumAllProducts(){
            List<Product> allProducts = producktRepository.getAllProducts();

            assertEquals(3, allProducts.size());
        }
        @Test
    public void sumProducts(){
        productController.addProducts(producktRepository.getAllProducts());
        double price = productController.sumPrice();
        assertEquals(5200, price, 0);

        }

    @Test
    public void addDiscount(){
        productController.addProducts(producktRepository.getAllProducts());

    }
}