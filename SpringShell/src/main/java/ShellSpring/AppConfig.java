package ShellSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    DateCommand getDate() {
        return new DateCommand();
    }

    @Bean
    DirCommand getDir() {
        return new DirCommand();
    }

    @Bean
    ExiteCommand getExite() {
        return new ExiteCommand();
    }

    @Bean
    HelpCommand getHelp() {
        return new HelpCommand();
    }

    @Bean
    TimeCommand getTime() {
        return new TimeCommand();
    }

    @Bean
    ShellManager getShellManager() {
        return new ShellManager();
    }
}
