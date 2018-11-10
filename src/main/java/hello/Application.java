package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

/*
Although it is possible to package this service as a traditional WAR file for deployment to an external
application server, the simpler approach demonstrated below creates a standalone application.
You package everything in a single, executable JAR file, driven by a good old Java main() method.
Along the way, you use Spring’s support for embedding the Tomcat servlet container as the HTTP runtime,
instead of deploying to an external instance.
 */