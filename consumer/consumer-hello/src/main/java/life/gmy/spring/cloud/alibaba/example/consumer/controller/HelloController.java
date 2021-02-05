package life.gmy.spring.cloud.alibaba.example.consumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import life.gmy.spring.cloud.alibaba.example.api.HelloService;

/**
 * HelloController
 * @author gmy
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    @DubboReference
    private HelloService helloService;
@GetMapping("{message}")
public String hello(@PathVariable String message){
    return helloService.echo(message);
}
    
}