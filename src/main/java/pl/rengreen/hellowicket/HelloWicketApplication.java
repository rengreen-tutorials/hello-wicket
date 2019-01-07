package pl.rengreen.hellowicket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class HelloWicketApplication {
    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder()
                .sources(HelloWicketApplication.class)
                .run(args);
    }

}

