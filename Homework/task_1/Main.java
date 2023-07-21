package ProjectOOP.Homework.task_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод 
//getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
// и воспроизвести логику, заложенную в программе
// Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
public class Main {
    public static void main(String[] args) {
        HotDrink cup1 = new HotDrink("Tea", 12.50 , 0.75, 50);
        HotDrink cup2 = new HotDrink("Coffee", 15.40 , 1.00, 60);
        HotDrink cup3 = new HotDrink("Cocoa", 25.00 , 0.50, 60);
        HotDrink cup4 = new HotDrink("Cappuccino", 26.00 , 0.40, 55);

        List<HotDrink> hotProduct = new ArrayList<>();
        hotProduct.add(cup1); hotProduct.add(cup2); hotProduct.add(cup3); hotProduct.add(cup4);
        System.out.println(hotProduct);
        System.out.println();


        HotDrinkVendingMashine hotDrinkVendingMashine = new HotDrinkVendingMashine(hotProduct);
        
        String searchStr = "";
        String[] searchParams = {"Tea", "12.50", "0.75", "50"};
        searchStr = hotDrinkVendingMashine.getProduct("Tea", 12.50 , 0.75, 50).toString();
        System.out.printf("В автомате ищем %s :\n%s%n", Arrays.toString(searchParams), searchStr);
    }
}

