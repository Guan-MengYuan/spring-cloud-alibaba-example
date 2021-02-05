package life.gmy.spring.cloud.alibaba.example.provider;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LJ3066
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderHelloApplication {
    public static void main(String[] args) {
        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder();
        springApplicationBuilder.web(WebApplicationType.NONE)
                .sources(ProviderHelloApplication.class).run(args);
    }
}
