package shop;

import java.util.ArrayList;
import java.util.List;

public class ProductController {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product p){
        productList.add(p);

    }

    public void addProducts(List<Product> products){
        productList.addAll(products);
    }

    public void delateProduct(Product p){
        productList.remove(p);

    }
    public double sumPrice(){
        double sum = 0;
        for (Product product: productList) {
            sum += product.getPrice();
        }
        return sum;
    }

    public void addDiscount(int percent){
        for (Product p : productList) {
            double newPrice = p.getPrice() - p.getPrice() * percent / 100;
            p.setPrice(newPrice);
        }
//        productList.forEach(p ->  p.setPrice(p.getPrice() - p.getPrice() * percent / 100));

    }
    public void getCartSize(){

    }
}
