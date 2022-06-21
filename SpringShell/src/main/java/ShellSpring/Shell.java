package ShellSpring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Scanner;


public class Shell {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        ShellManager shel = context.getBean(ShellManager.class);
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("(user)>>");
            String cmd = in.nextLine();
            shel.doShell(cmd);
        }

    }
}


