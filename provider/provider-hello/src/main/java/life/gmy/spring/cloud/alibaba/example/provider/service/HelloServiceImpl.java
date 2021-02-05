package life.gmy.spring.cloud.alibaba.example.provider.service;

import life.gmy.spring.cloud.alibaba.example.api.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author LJ3066
 */
@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String echo(String message) {
        return message;
    }
}
