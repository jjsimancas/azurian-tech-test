package cl.azurian.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

@SpringBootApplication
public class ClAzurianTestAppApplication extends WsConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(ClAzurianTestAppApplication.class, args);
    }

}
