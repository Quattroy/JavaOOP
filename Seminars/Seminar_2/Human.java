package ProjectOOP.Seminars.Seminar_2;

public class Human extends Actor{ // базовый класс Actor уже наследует интерфейс, поэтому implements ActorBBehaviour не нужно добавлять

    public Human(String name) {
        super(name);
    }

    @Override
    public void setMakeOrder(boolean status) {

    }

    @Override
    public void setTakeOrder(boolean status) {
       
    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }

    @Override
    String getName() {
        return super.getName();
    }
    
}
