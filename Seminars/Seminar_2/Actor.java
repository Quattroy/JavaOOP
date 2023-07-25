package ProjectOOP.Seminars.Seminar_2;

public abstract class Actor implements ActorBehaviour { // cсразу наследует и интерфейс, поэтому в Human вызывать не нужно интерфейс еще раз
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    String getName(){
        return this.name;
    }

    public Actor(String name) {
        this.name = name;
    }
}
