package ShellSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Set;

@Component
public class HelpCommand implements Command {

    @Autowired
    private Set<Command> commands;
    @Override
    public String getName() {
        return "help";
    }

    @Override
    public void exec() {
        for (Command com: commands){
            System.out.println(com.getHelp());
        }
    }

    @Override
    public String getHelp() {
        return "help - show functions of shell";
    }
}
