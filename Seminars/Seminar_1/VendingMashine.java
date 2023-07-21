package ProjectOOP.Seminars.Seminar_1;

import java.util.List;

public interface VendingMashine {
    Product getProduct(String name) throws IllegalStateException; //если будет ошибка
    
    boolean addProduct(List<Product> productList); //для инициализации продукта?


}
