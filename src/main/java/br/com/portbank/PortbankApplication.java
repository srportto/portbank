package br.com.portbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.portbank")
public class PortbankApplication {
    public static void main(String[] args) {
        SpringApplication.run(PortbankApplication.class, args);
    }
}
