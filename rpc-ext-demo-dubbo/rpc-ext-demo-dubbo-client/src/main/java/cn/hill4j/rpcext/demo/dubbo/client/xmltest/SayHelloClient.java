package cn.hill4j.rpcext.demo.dubbo.client.xmltest;

import cn.hill4j.rpcext.demo.dubbo.api.SayHello;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 2019/8/28 19:34 <br>
 * Description: SayHelloClient
 *
 * @author hillchen
 */
@Component("sayHelloClient")
public class SayHelloClient {
    @Resource
    private SayHello sayHello;

    /**
     *
     * @param name 测试用户
     * @return 返回测试内容
     */
    public String sayHello(String name){
        return sayHello.sayHello() + ", " + name;
    }
}
