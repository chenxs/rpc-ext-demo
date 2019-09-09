package cn.hill4j.rpcext.demo.dubbo.client.anbeantest;

import cn.hill4j.rpcext.demo.dubbo.api.SayHello;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * 2019/8/28 19:34 <br>
 * Description: SayHelloClient
 *
 * @author hillchen
 */
@Component("anBeanSayHelloClient")
public class AnBeanSayHelloClient {
    @Reference
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
