package ProjectOOP.Seminars.Seminar_2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {

    public static final String Market = null;
    private final List<Actor> queue; 
    private List<Actor> releasedActors;

    public Market() {    // конструктор
    this.queue = new ArrayList<>();
    this.releasedActors = new ArrayList<>();
    

    }

    // описываем методы из интерфейса

    @Override
    public void takeInQueue(Actor actor){ // какой то актор встал в очередь 
        System.out.println(actor.getName() + " Встал в очередь");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for(Actor actor: queue) { // перебираем очередь
            if(!actor.isMakeOrder()) { // если заказ еще не выполнен
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " Сделал заказ"); //кто сделал заказ на печать
            }
        }
    }

    @Override
    public void giveOrders() {
        for(Actor actor: queue) { // перебираем очередь
            if(!actor.isMakeOrder()) { // если заказ уже выполнен
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " Получил заказ"); //кто сделал заказ на печать
            }
        }
    }

    @Override
    public void releaseFromQueue(){ // человек уходит из очереди
        // List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor: queue) {
            if(!actor.isTakeOrder()){
                releasedActors.add(actor);
                System.out.println(actor.getName() + "  Вышел из очереди");
            }
        }
        releaseFromMarket(releasedActors);
    }


    @Override
    public void acceptToMarket(Actor actor){
        System.out.println(actor.getName() + " Пришел в магазин");
        takeInQueue(actor); // в магазин пришел актор и сразу стал в очередь
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) { // массив людей, которые готовы выйти из очереди
        for(Actor actor: actors) {
            System.out.println(actor.getName() + " Вышел из магазина");
            queue.remove(actor); // удаляем из списка (вышедших из очрееди) актора, выкидывая его из магазина
        }
    }

    public void update() { //чтобы обновить статус всего, что касается очередей
        takeOrders();
        giveOrders();
        releaseFromQueue();
        
        // вызывает все методы подряд и обновит Market
    }
}
