package ProjectOOP.Homework.task_7;

import ProjectOOP.Homework.task_7.interfaces.CreateCalc;
import ProjectOOP.Homework.task_7.view.UserViewConsole;
import ProjectOOP.Homework.task_7.logger.ConsoleLog;
import ProjectOOP.Homework.task_7.logger.CreateLog;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to my new calculator!\n");
        CreateCalc newCalc = new CreateLog(new ConsoleLog());
        UserViewConsole console = new UserViewConsole(newCalc);
        console.programStart();
    }
}