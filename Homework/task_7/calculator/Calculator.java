package ProjectOOP.Homework.task_7.calculator;

import ProjectOOP.Homework.task_7.interfaces.Operations;

public class Calculator implements Operations {

    private Double inNumber;
    public Calculator(Double inNumber){
        this.inNumber = inNumber;
    }

    // Используем фабричный паттерн
    @Override
    public Operations sum(double num) {
        this.inNumber += num;
        return this;
    }

    @Override
    public Operations div(double num) {
        this.inNumber /= num;
        return this;
    }

    @Override
    public Operations mult(double num) {
        this.inNumber *= num;
        return this;
    }

    @Override
    public Operations menos(double num) {
        this.inNumber -= num;
        return this;
    }

    @Override
    public double getResult() {
        return inNumber;
    }
}