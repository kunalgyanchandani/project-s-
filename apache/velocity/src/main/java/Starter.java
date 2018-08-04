import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;

public class Starter
{
    public static void main(String... args)
    {
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.init();

        Template template=velocityEngine.getTemplate("./apache/velocity/src/main/resources/Hello.vt");
        //TODO getResource
        //Template template=velocityEngine.getTemplate(String.valueOf(Starter.class.getClassLoader().getResource("../resHello.vt")));
        VelocityContext context= new VelocityContext();
        context.put("message","Hello World");
        StringWriter writer= new StringWriter();
        template.merge(context,writer);
        System.out.println(writer.toString());
    }
}
