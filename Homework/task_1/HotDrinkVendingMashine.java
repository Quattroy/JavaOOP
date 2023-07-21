package ProjectOOP.Homework.task_1;

import java.util.List;

public class HotDrinkVendingMashine implements VendingMashine{


    private List<HotDrink> products;
    

    public HotDrinkVendingMashine(List<HotDrink> products) {
        this.products = products;
       
    }


    public Product getProduct(String name, Double cost, Double volume, Integer temperature){

        for(HotDrink product: products){
            if(product instanceof HotDrink){
                if(product.getName().equalsIgnoreCase(name)
                        && product.getVolume() == volume
                        &&  product.getTemperature() == temperature) {
                    return product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
  
    

    @Override
    public Product getProduct(String name) throws IllegalStateException {
        for(HotDrink product: products){
            if(product instanceof HotDrink){
                if (product.getName().equalsIgnoreCase(name)) {
                    return product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));

    }


    @Override
    public boolean addProduct(List<Product> productList) {
        if(products != null && productList == null) {
            return false;
        }
        for(Product item: productList) {
            products.add((HotDrink) item);
        }
        return true;
        }
}
