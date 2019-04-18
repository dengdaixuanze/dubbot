import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class StartMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-provide.xml");
        context.start();
        System.in.read();
    }
}
