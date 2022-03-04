package asciiPanel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config-annotation.xml");
        AsciiPanel asciiPanel = context.getBean(AsciiPanel.class);
        System.out.println(asciiPanel.getAsciiFont().getFontFilename());
        System.out.println(asciiPanel.getAsciiFont().getWidth());
        System.out.println(asciiPanel.getAsciiFont().getHeight());
    }
}