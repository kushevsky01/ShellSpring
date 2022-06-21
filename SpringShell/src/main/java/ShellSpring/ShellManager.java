package ShellSpring;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;


public class ShellManager {
    @Autowired
    private Set<Command> commands;


    public void doShell(String cmd) {
        boolean correct = false;
        for (Command command : commands) {
            correct = false;
            if (command.getName().contentEquals(cmd)) {
                command.exec();
                correct = true;
                break;
            }
        }
        if (!correct) {
            System.out.println(cmd + "-  не является внутренней или внешней командой");
            ;
        }
    }
}

