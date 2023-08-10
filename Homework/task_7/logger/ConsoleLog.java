package ProjectOOP.Homework.task_7.logger;

import ProjectOOP.Homework.task_7.interfaces.WriterLog;

public class ConsoleLog implements WriterLog {
    @Override
    public void log(String message) {
        System.out.println("Log:" + message);
    }
}