package ProjectOOP.Seminars.Seminar_2;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);  // приход покупателя
    void releaseFromMarket(List<Actor> actors);// Список будет реализовываться как готовая очередь в основном классе
    void update();// уход покупателя
    // обновить сосотояние магазина
    
}
