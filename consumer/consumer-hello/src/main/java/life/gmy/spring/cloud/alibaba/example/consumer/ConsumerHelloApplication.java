package life.gmy.spring.cloud.alibaba.example.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ConsumerHelloApplication
 * @author gmy
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHelloApplication.class, args);
    }
}