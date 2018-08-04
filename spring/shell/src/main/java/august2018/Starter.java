package august2018;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;


@ShellComponent
@SpringBootApplication
public class Starter {

    public static void main(String... args) {

        new SpringApplicationBuilder(Starter.class).run(args);
        //new Starter();
    }


    @ShellMethod(value = "Add numbers.", key = "sum")
    public int add(int a, int b) {
        return a + b;
    }

    @ShellMethod("translate text")
    public String translate(
                    String text,
                    String from,
                    String to
    ) {
        return text;
    }
}