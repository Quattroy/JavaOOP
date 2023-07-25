package ProjectOOP.Seminars.Seminar_2;

public interface QueueBehaviour {
    void takeInQueue(Actor actor); // объект класса Actor принимает , втает в очередь
    void takeOrders(); // получаем заказ
    void giveOrders(); // отдаем заказ
    void releaseFromQueue(); // выход из очереди
}
