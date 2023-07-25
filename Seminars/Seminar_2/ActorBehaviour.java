package ProjectOOP.Seminars.Seminar_2;

public interface ActorBehaviour {
    void setMakeOrder(boolean status);
    void setTakeOrder(boolean status);

    boolean isMakeOrder();
    boolean isTakeOrder();
}
