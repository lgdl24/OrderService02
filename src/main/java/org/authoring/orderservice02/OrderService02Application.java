package org.authoring.orderservice02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrderService02Application {

    @GetMapping("/")
    public String Home() {
        return "Home";
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderService02Application.class, args);
    }

}
