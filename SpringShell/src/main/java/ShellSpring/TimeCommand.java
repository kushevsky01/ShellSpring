package ShellSpring;


import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class TimeCommand implements Command {
    @Override
    public String getName() {
        return "time";
    }

    @Override
    public void exec() {
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
    }

    @Override
    public String getHelp() {
        return "time - Moscow time";
    }
}
