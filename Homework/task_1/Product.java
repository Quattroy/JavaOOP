//Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
// initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)
package ProjectOOP.Homework.task_1;

public abstract class Product {

    private String name;
    private Double cost;

    //абстракция
    public Product(String name, Double cost){
        setName(name); // this.name = name
        setCost(cost); // this.cost = cost
    }

    public String getName() {  //абстракция
        return name;
    }

    public Double getCost() {   //абстракция
        return cost;
    }

    public void setName(String name) { // инкапсуляция
        this.name = name;
    }

    public void setCost(Double cost) { // инкапсуляция
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + 
                ", cost=" + cost + '}';
    }

   
}
