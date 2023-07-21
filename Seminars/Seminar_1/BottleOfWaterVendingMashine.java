package ProjectOOP.Seminars.Seminar_1;
// Задача 4 - Полиморфизм
// � Переопределите метод toString для Товара, запустите программу, после этого переопределите для
// наследника этот метод, после запуска обратите внимание на изменение поведения.
// � Создайте перегруженный метод выдачи товара ТорговымАвтоматом дополнив дополнительным
// входным параметром (пример: getProduct(String name) выдающий товар по имени, создайте метод
// возвращающий товар по имени и какому-либо параметру товара getProduct(String name, int volume)

public class BottleOfWaterVendingMashine inmplements VendingMashine {
    
    private List<Product> products;
    
    public BottleOfWaterVendingMashine(List<Product> products) {
        this.products = products;
    }
    
    public Product getProduct(String name) {
        for(Product product:products) {
            if(product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт с названием %s не найден.", name));
    }
    
    public boolean addProduct(List<Product> productList) {
        if(products != null && productList == null) {
            return false;
        }
        for(Product item: productList) {
            products.add(item);
        }
        return true;
    }
}
