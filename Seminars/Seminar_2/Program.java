
package ProjectOOP.Seminars.Seminar_2;

public class Program {
    public static void main(String[] args) {
        Market market = new Market(); // создали экземпляр класса магазин

        Human human1 = new Human("Petya"); // создали двух человек
        Human human2 = new Human("Masha");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();

    }
}
