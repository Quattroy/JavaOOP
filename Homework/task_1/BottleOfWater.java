package ProjectOOP.Homework.task_1;
//наследование. Задача 3 - Наследование
// � Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды),
// сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа
// ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)
public class BottleOfWater extends Product{ // содержит цену и название

    private Double volume; // объем

    public BottleOfWater(String name, Double cost, Double volume){
        super(name, cost);// это метод, в который мы передаем параметры, эти параметры он передаст в родительский класс. В род. классе будут вызваны эти параметры
        this.volume = volume;
    }
    public Double getVolume() {
        return volume;
    }
    public void  setVolume(Double volume) {
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "BottleOfWater{" + "name='" + super.getName() + '\'' + 
        ", cost=" + super.getCost() + '\'' + "volume=" + this.volume + '}';
    }
    
}
