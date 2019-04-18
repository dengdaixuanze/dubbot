import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.StuService;

import java.io.IOException;
import java.util.Scanner;

public class ClientStart {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("spring-consumer.xml");
        context.start();
        StuService bean = context.getBean("stuService",StuService.class);
        String cmd;
        while(!"exit".equals(cmd=read())){
            System.out.println(bean.say());
        }
        System.in.read();
    }

    public static String read(){
        Scanner scan=new Scanner(System.in);
       return scan.next();
    }
}
