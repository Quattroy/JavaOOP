package ProjectOOP.Homework.task_7.logger;

import ProjectOOP.Homework.task_7.calculator.Calculator;
import ProjectOOP.Homework.task_7.interfaces.CreateCalc;
import ProjectOOP.Homework.task_7.interfaces.Operations;
import ProjectOOP.Homework.task_7.interfaces.WriterLog;

public class CreateLog implements CreateCalc {
    private WriterLog writerLog;
    public CreateLog(WriterLog writerLog){
        this.writerLog = writerLog;
    }
    @Override
    public Operations create(double num) {
        return new CalcLog(new Calculator(num), writerLog);
    }
}