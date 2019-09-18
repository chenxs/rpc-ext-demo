package cn.hill4j.rpcext.demo.dubbo.client.annotiontest;

import cn.hill4j.rpcext.demo.dubbo.api.SayHello;
import cn.hill4j.rpcext.demo.dubbo.api.other.SayWhy;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;


/**
 * 2019/8/28 19:34 <br>
 * Description: SayHelloClient
 *
 * @author hillchen
 */
public class AnnotationSayWhyClient {
    @Reference
    private SayWhy sayWhy;

    /**
     *
     * @param name 测试用户
     * @return 返回测试内容
     */
    public String sayWhy(String name){
        return sayWhy.sayWhy() + ", " + name;
    }
}
