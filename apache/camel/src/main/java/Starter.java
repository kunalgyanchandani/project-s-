import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.main.Main;

public class Starter {

    public static void main(String... args) throws Exception {

        System.out.println("Apache Camel Experiment");
        Main main = new Main();
        main.enableHangupSupport();
        main.addRouteBuilder(new HTMLRouteBuilder());
        main.run(args);


    }

    static class HTMLRouteBuilder extends RouteBuilder {

        public void configure() throws Exception {

            //http://ics.upjs.sk/~novotnyr/blog/248/mounting-the-camel-a-stdin-stdoud-example
            from("stream:in").transform().simple("You entered ${in.body}").to("stream:out");


            /*
            from("direct:in").to("stream:out")
                    .log("Log")
            ;

            from("timer://foo?fixedRate=true&delay=0&period=10")
                    //.to("mock:result")
                    .to("http://www.google.com")
                    .log("test");

            */
        }
    }

}
